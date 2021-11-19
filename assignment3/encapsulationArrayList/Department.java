package encapsulationArrayList;

public class Department {
    private String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartName() {
        return departmentName;
    }

    @Override
    public String toString() {
        return  departmentName;
    }
}

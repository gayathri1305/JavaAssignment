package assignment3.encapsulation;

public class College {
    private  String collegeName;
    private  String deptName;

    public void setCollegeName(String collegeName){
        this.collegeName=collegeName;
    }

    public String getCollegeName(){
        return  collegeName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

}

package encapsulationArrayList;

import java.util.ArrayList;
import java.util.List;

public class College {
    private String collegeName;
    private List<Department> deptList= new ArrayList<>();

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void addDeptList(List<String> deptNameList) {
        for(String deptName:deptNameList){
            this.deptList.add(new Department(deptName));
        }
    }

    public ArrayList<Department> getDeptList() {
        return new ArrayList<Department>(this.deptList);
    }
}

package assignment3.encapsulation;

public class CollegeDetails {
    public static void main(String[] args) {
        College coll=new College();
        // First college and depatment name
        coll.setCollegeName("Anna University");
        System.out.println("College Name: "+ coll.getCollegeName());

        coll.setDeptName("ECE");
        System.out.println("DepartmentName: "+coll.getDeptName());

        //Second college and department name
        coll.setCollegeName("Anna University-CEG");
        System.out.println("College Name: "+ coll.getCollegeName());

        coll.setDeptName("IT");
        System.out.println("DepartmentName: "+coll.getDeptName());

        //Third college and department name
        coll.setCollegeName("Dr.Sivanthi Aditanar");
        System.out.println("College Name: "+ coll.getCollegeName());

        coll.setDeptName("MECH");
        System.out.println("DepartmentName: "+coll.getDeptName());

        //Fourth college and department name
        coll.setCollegeName("Government College");
        System.out.println("College Name: "+ coll.getCollegeName());

        coll.setDeptName("CSE");
        System.out.println("DepartmentName: "+coll.getDeptName());


    }
}

package encapsulationArrayList;


import java.util.Arrays;

public class CollegeMain {
    public static void main(String[] args) {
        College college1 = new College();
        college1.setCollegeName("College Of Engineering");
        college1.addDeptList(Arrays.asList(new String[]{"ECE", "IT","MECH","AI","CSC"}));
        System.out.println("College Name: "+ college1.getCollegeName()+" & "+ college1.getDeptList());

        College college2 = new College();
        college2.setCollegeName("RV College Of Engineering");
        college2.addDeptList(Arrays.asList(new String[]{"ECE, IT","MECH","AI","CSC","AERO","CIVIL"}));
        System.out.println("College Name: "+ college2.getCollegeName()+" & "+ college2.getDeptList());

        College college3 = new College();
        college3.setCollegeName("Government College Of Engineering");
        college3.addDeptList(Arrays.asList(new String[]{"ECE, IT","MECH","CIVIL","CSC","EEE"}));
        System.out.println("College Name: "+ college3.getCollegeName()+" & "+ college3.getDeptList());

        College college4 = new College();
        college4.setCollegeName("Anna University");
        college4.addDeptList(Arrays.asList(new String[]{"ECE, IT","MECH","AI","CSC","EEE","CIVIL"}));
        System.out.println("College Name: "+ college4.getCollegeName()+" & "+ college4.getDeptList());


    }

}

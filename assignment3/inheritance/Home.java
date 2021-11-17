package assignment3.inheritance;

public class Home {
    String roomType;
    int lightCount;

    public Home(String roomType, int lightCount){
        this.roomType=roomType;
        this.lightCount=lightCount;
    }

    public void noOfLight(){
        System.out.println("No of Light in "+ roomType+ " is : "+lightCount);
    }

}

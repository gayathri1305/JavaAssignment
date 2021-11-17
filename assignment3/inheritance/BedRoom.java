package assignment3.inheritance;

public class BedRoom extends Home {

    public BedRoom() {

        super("Bedroom", 2);
    }
    /* if needed can be overriding like below
    @Override
    public void noOfLight() {
        super.noOfLight();
        System.out.println("adding more behavior");
    }

     */
}

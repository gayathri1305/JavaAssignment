package assignment3.inheritance;

public class Apartment extends Home {

    public Apartment(String roomType, int lightCount) {

        super(roomType, lightCount);
    }


    public static void main(String[] args) {
       Apartment hall= new Apartment("Hall",5);
       hall.noOfLight();

        Apartment kitchen= new Apartment("Kitchen",2);
        kitchen.noOfLight();

        Apartment bed= new Apartment("Bedroom",2);
        bed.noOfLight();



    }
}

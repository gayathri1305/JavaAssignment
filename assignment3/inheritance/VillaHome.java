package assignment3.inheritance;

public class VillaHome extends Home{

    public VillaHome(String roomType, int lightCount){
        super(roomType,lightCount);

    }
    public static void main(String[] args) {
        // bedroom tye1
        VillaHome bed= new VillaHome("Main Bed Room",2);
        bed.noOfLight();

        //bed room type 2
        VillaHome subbed=new VillaHome("Sub Bed Room", 3);
        subbed.noOfLight();

        // Hall
        VillaHome hall= new VillaHome("Hall",5);
        hall.noOfLight();

    }
}

package inheritance;

public class OurHouse {
    public static void main(String[] args) {
        Home drawingRoom=new DrawingRoom(4);
        Home BedRoom=new BedRoom(5);
        Home KidRoom=new KidRoom(6);

        System.out.println("DrwaingRoom lights:"+drawingRoom.getNoOfLights());
       System.out.println("BedRoom Lights:"+BedRoom.getNoOfLights());
        System.out.println("KidsRoom Lights:"+KidRoom.getNoOfLights());


    }
}

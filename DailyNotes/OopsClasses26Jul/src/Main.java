import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Institue ins1 = new Institue();
        ins1.instName = "Vision IT";
        ins1.rooms = new ArrayList<>();

        Room room1 = new Room();
        room1.roomName = "Java Room";
        room1.fans = new ArrayList<>();
        room1.chairs = 40;
        room1.projector = 1;
        room1.lights = 10;

        Fan f1 = new Fan();
        f1.name = "Usha";
        f1.color = "Black";
        f1.price = 5000;
        f1.wings = 5;

        Fan f2 = new Fan();
        f2.name = "Bajaj";
        f2.color = "Orange";
        f2.price = 4000;
        f2.wings = 10;

        Fan f3 = new Fan();
        f3.name = "Orient";
        f3.color = "White";
        f3.price = 2500;
        f3.wings = 4;

        room1.fans.add(f1);
        room1.fans.add(f2);
        room1.fans.add(f3);

        Room room2 = new Room();
        room2.roomName = "Python Room";
        room2.chairs = 2;
        room2.projector = 0;

        Room room3 = new Room();
        room3.roomName = "SQL";
        room3.chairs = 20;
        room3.projector = 1;

        ins1.rooms.add(room1);
        ins1.rooms.add(room2);
        ins1.rooms.add(room3);


        System.out.println(ins1.rooms.get(0).fans.get(1).color);
    }
}
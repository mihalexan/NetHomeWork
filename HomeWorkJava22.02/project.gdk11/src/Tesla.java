import car.Doors;
import motorbike.Wheels;
public class Tesla {
    public static void main (String[] args) {
        Doors welcomeOfDoors = new Doors();
        Wheels welcomeOfWheels = new Wheels();

        System.out.println("Hello. I am - " + welcomeOfDoors.name +" I have the "+welcomeOfDoors.accessories);
        System.out.println("Hello. and i - "+ welcomeOfWheels.name);
    }
}

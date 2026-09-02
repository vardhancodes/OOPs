class Aeroplane{

    public void takeoff()
    {
        System.out.println("Plane is taking off");
    }

    public void fly()
    {
        System.out.println("Plane is flying");
    }
}
class Cargoplane extends Aeroplane{
    public void takeoff()
    {
        System.out.println("Cargoplane is taking off");
    }

    public void fly()
    {
        System.out.println("Cargoplane is flying");
    }
}
class Fighterplane extends Aeroplane{
    public void takeoff()
    {
        System.out.println("fighterplane is takingoff");
    }

    public void fly()
    {
        System.out.println("fighterplane is flying");
    }
}
public class LaunchPolymorphism {
    public static void main(String[] args) {
        Cargoplane cp = new Cargoplane();
        Fighterplane fp = new Fighterplane();

        Aeroplane aero;
        aero = cp;
        aero.fly();
        aero.takeoff();

        aero = fp;
        aero.takeoff();
        aero.fly();

    }
}

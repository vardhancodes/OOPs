interface Engine{
    void start();
}
class PetrolEngine implements Engine{
    public void start()
    {
        System.out.println("Petrol Engine Starting");
    }
}
class ElectricEngine implements Engine{
    
    public void start()
    {
        System.out.println("Electric Engine starting");
    }
}

class Car{
    Engine e;

    Car(Engine e)
    {
        this.e = e;
    }

    void start()
    {
        e.start();
    }
}

public class LaunchLooseCoupling{
    public static void main(String[] args) {
        Car c= new Car(new ElectricEngine());
        c.start();
    }
}

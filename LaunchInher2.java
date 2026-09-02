class Parent{
    void sleep()
    {
        System.out.println("Sleeps a lot");
    }

    void dressingstyle()
    {
        System.out.println("dresses based on their time");
    }
}

class Child extends Parent{

    void dressingstyle()
    {
        System.out.println("dresses based on modern times");
    }

    void habit()
    {
        System.out.println("child swims well");
    }

}

public class LaunchInher2{
    public static void main(String[] args) {
        Parent a = new Child();
        a.dressingstyle();
        ((Child) a).habit();
        a.sleep();
    }
}
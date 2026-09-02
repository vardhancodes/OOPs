class Dog{
    
    int cost;
    String name;
    void barks()
    {
        int age = 4;
        System.out.println("Dog barks");
        age = 6;
        System.out.println(age);
    }

    void run()
    {        System.out.println("Dog is running");
    }
}
public class LaunchOOP2 {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.barks();

    }
}

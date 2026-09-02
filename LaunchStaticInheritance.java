class Animal1{
    static int age;

    static void display()
    {
        System.out.println("Parent class static method");
    }
}

class Deer extends Animal1{
    static void display()
    {
        System.out.println("Deer class static method");
    }
}

public class LaunchStaticInheritance{
    public static void main(String[] args) {
        Animal1 a = new Deer();
        a.display();
        Deer.display();


    }
}
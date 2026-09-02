class Animal{
    protected void eat()
    {
        System.out.println("Animal is eating");
    }
}
class Tiger extends Animal{
    public void eat()
    {
        System.out.println("Tiger is eating");
    }
}
public class LaunchInheritance4 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat();
    }
}

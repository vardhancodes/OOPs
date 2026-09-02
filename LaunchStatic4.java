import java.util.*;
class Farmer{
    private float pa;
    private float si;
    private float td;
    private static float rate;

    static{
        rate = 4.5f;
    }

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly enter your principle amount");
        pa = sc.nextFloat();

        System.out.println("Kindly enter time duration in years");
        td = sc.nextFloat();

    }

    void compute()
    {
        si = (pa*rate*td)/100.0f;

    }

    void display()
    {
        System.out.println("SI is : " + si);
    }

}
public class LaunchStatic4{
    public static void main(String[] args) {
        System.out.println("Farmer Loan Application");
        Farmer f1 = new Farmer(); 
        Farmer f2 = new Farmer(); 
        Farmer f3 = new Farmer(); 

        System.out.println("Farmer 1 kindly fill the form");
        f1.input();
        f1.compute();
        f1.display();

        System.out.println("Farmer 2 kindly fill the form");
        f2.input();
        f2.compute();
        f2.display();

        System.out.println("Farmer  kindly fill the form");
        f3.input();
        f3.compute();
        f3.display();
    }
}
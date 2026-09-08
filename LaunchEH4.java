import java.util.Scanner;

class Demo{

    public void divide()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly! Enter numerator");
        int n = sc.nextInt();
        System.out.println("Kindly! Enter denominator");
        int d = sc.nextInt();
        int res = n/d;
        System.out.println(res);
    }
}

public class LaunchEH4 {
    public static void main(String[] args) {
        Demo d = new Demo();
        try {
            d.divide();
        } catch (Exception e) {
            System.out.println("Exception handled at main");
        }
    }
}

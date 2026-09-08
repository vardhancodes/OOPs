import java.util.*;
class D1{
    public void divide()
    {
        // try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Kindly! Enter numerator");
            int n = sc.nextInt();
            System.out.println("Kindly! Enter denominator");
            int d = sc.nextInt();
            int res = n/d;
            System.out.println(res);
            
        // } catch (Exception e) {
            System.out.println("Exception Handled in D1");
        // }
        
    }
}

class D2{

    D1 d = new D1();

    public void func1()
    {
        try{
            d.divide();
        }
        catch(Exception e)
        {
            System.out.println("Exception Handled in D2");
        }
    }
    

}

public class LaunchEH5 {
    public static void main(String[] args) {
        D2 d2 = new D2();
        try{
            d2.func1();
        }
        catch(Exception e)
        {
            System.out.println("Exception Handled at Main");
        }
    }
}

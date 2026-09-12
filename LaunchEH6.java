import java.util.*;
class Alpha
{
    public void divide()
    {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Kindly! Enter numerator");
            int n = sc.nextInt();
            System.out.println("Kindly! Enter denominator");
            int d = sc.nextInt();
            int res = n/d;
            System.out.println(res);
            
        }catch (Exception e) {
            System.out.println("Exception Handled in alpha");
            throw e;
        }
        
    }
    
}



public class LaunchEH6 {
    public static void main(String[] args)
    {
        Alpha a = new Alpha();
        a.divide();
    }
}

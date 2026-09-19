import java.util.*;
class Alpha
{
    public void divide() throws ArithmeticException
    {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Kindly! Enter numerator");
            int n = sc.nextInt();
            System.out.println("Kindly! Enter denominator");
            int d = sc.nextInt();
            if(d < 0)
            {
                throw new ArithmeticException();
            }
            int res = n/d;
            System.out.println(res);
            
        }catch (Exception e) {
            System.out.println("Exception Handled in alpha");
            throw e;
            
        }
        finally{
            System.out.println("App terminated");

        }

        
    }
    
}



public class LaunchEH6 {
    public static void main(String[] args)
    {
        Alpha a = new Alpha();
        try{
        a.divide();
        }

        catch(ArithmeticException e)
        {
            System.out.println("Handled in main");

        }
    }
}

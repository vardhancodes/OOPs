import java.util.Scanner;

public class LaunchEh3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter numerator to divide");
            int n = sc.nextInt();
            System.out.println("Enter denominator");
            int d= sc.nextInt();
            int res = n/d; //ArithmeticException
            System.out.println(res);
            System.out.println("Enter size of an array");
            int size = sc.nextInt();
            int ar[] = new int[size]; //NegativeArraySizeException
            System.out.println("Enter data to be inserted");
            int data = sc.nextInt();
            System.out.println("Enter position at which you want the data to be inserted");
            int pos = sc.nextInt();
            ar[pos] = data; //ArrayIndexOutOfBoundsException
        } 
        catch (ArithmeticException e) {
            System.out.println("enter non-zero denominator");
        }
        catch(NegativeArraySizeException e)
        {
            System.out.println("Stay Positive");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Be within your limits");
        }
        System.out.println("App terminated");
    }
}

import java.util.Scanner;
public class LaunchEh2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numerator to divide");
        int n = sc.nextInt();
        System.out.println("Enter denominator");
        int d= sc.nextInt();
        try{
            int res = n/d;
            System.out.println(res);
        }
        catch(Exception e)
        {
            System.out.println("Enter non-zero denominator");
        }

        

        

    }
}

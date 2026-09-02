//dev1
class Calc{

    int add(int a, int b)
    {
        int res = a+b;
        return res;

    }

    float add(float a, int b)
    {
        float res = a+b;
        return res;

    }

    int add(int a, int b, int c)
    {
        int res = a+b+c;
        return res;

    }

}



//dev2
public class LaunchMO {
    public static void main(String[] args) {
        Calc c =  new Calc();
        System.out.println(c.add(4,4)); 
    }
}

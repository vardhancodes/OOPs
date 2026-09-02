interface Calc{
   public void add(int a, int b);
   public int mul(int a , int b);
}

class Mycalc implements Calc{
    public void add(int a , int b)
    {
        System.out.println(a+b);
    }

    public int mul(int a , int b)
    {
        return a*b;
    }
}

class Mycalc2 implements Calc{
    public void add(int a , int b)
    {
        System.out.println(a+b+10);
    }

    public int mul(int a , int b)
    {
        return a*b*2;
    }
}
public class LaunchInterface {
    public static void main(String[] args) {
        Mycalc c1 = new Mycalc();
        Mycalc2 c2 = new Mycalc2();
        c1.add(2,3);
        c2.add(2,3);
    }
}

class Demo{
    static int a,b;
    int x,y;

    static{
        System.out.println("static init block");
    }

    {
        System.out.println("java init block or non-static block");
    }

    Demo()
    {
        System.out.println("Constructor");
    }

    static void disp()
    {
        System.out.println("disp static method");
    }

    void show()
    {
        System.out.println("non static method");
    }
}
public class LaunchStatic2 {
    static{
        System.out.println("static block main");
    }
    public static void main(String[] args) {
        System.out.println("main method");
        
    }
}

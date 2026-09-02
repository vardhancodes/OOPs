

class Demo1{
    int a,b;
    Demo1()
    {
        System.out.println("Demo1 Constructor");
    }

    Demo1(int a , int b)
    {
        this.a = a;
        this.b = b;
        System.out.println("demo1 param constructor");
        
    }
}
class Demo2 extends Demo1{
    Demo2(){
        super(4,5);
    }
}
public class LaunchInheritance3 {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
    }

}

@FunctionalInterface
interface Alien1{
    void disp();
}

class AlienImpl implements Alien1{
    public void disp()
    {
        System.out.println("disp of alien implemented using normal instance");
    }
} 

public class LaunchLambda {
    public static void main(String[] args) {
        AlienImpl a = new AlienImpl();
        a.disp();

        Alien1 a1 = new Alien1(){

            public void disp()
            {
                System.out.println("alien disp implemented using anonymous inner class");
            }
        };

        a1.disp();

        Alien1 a2 = () -> {
            System.out.println("Implemented using lambda");
        };

        a2.disp();
    }
}

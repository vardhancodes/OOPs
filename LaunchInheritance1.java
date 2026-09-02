class Alpha{

    void show()
    {
        System.out.println("Telusko has both live and recorded course");
    }
}

class Beta extends Alpha{
    
}


public class LaunchInheritance1 {
    public static void main(String[] args) {
        Beta beta = new Beta();
        beta.show();
    }
}

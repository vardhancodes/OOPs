class Telusko{
    
    private String name;
    private double cost;

    Telusko()
    {
        cost = 455.5;
    }

    Telusko(String name, double cost)
    {
        this.name = name;
        this.cost = cost;
    }

    Telusko(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}

public class LaunchConstructor {
    public static void main(String[] args) {
        Telusko t1 = new Telusko("System Design",3000.0);
        System.out.println(t1.getName()+" "+t1.getCost());
        t1.setName("DevOps with AWS");
        t1.setCost(4555.5);
        System.out.println(t1.getName()+" "+t1.getCost());

        Telusko t2 = new Telusko("Course2");
        System.out.println(t2.getName());
        
        Telusko t3 = new Telusko();
        System.out.println(t3.getCost());

        

    }
}

class Car{

    private String brand;
    private double cost;

    static int count;

    {
        count++;
    }

    static{
        System.out.println("hello");
    }

    Car()
    {

    }

    Car(String brand, double cost)
    {
        this.brand = brand;
        this.cost = cost;
        
        
    }

    Car(String brand)
    {
        this.brand = brand;
        
        
    }

}

class LaunchStatic{
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(Car.count);
        Car c1 = new Car("BMW");
        System.out.println(Car.count);
        Car c2 = new Car("Merc",2000);
        System.out.println(Car.count);
    }
}
class Employee{

    private int age;

    void setAge(int x)
    {
        age = x;
    }

    int getAge()
    {
        return age;
    }
}


public class LaunchEncap {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setAge(45);
        System.out.println(e.getAge());


        
    }
}

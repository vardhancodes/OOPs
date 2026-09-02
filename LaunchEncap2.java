class Employee2{

    private int id;
    private String name;

    void setId(int id)
    {
        this.id = id;
    }

    void setName(String name)
    {
        this.name = name;
    }

    int getId()
    {
        return id;
    }

    String getName()
    {
        return name;
    }

}
public class LaunchEncap2{

    public static void main(String[] args) {
        Employee2 emp = new Employee2();
        emp.setId(89);
        emp.setName("Shubh");
        System.out.println(emp.getId());
        System.out.println(emp.getName());
    }
}
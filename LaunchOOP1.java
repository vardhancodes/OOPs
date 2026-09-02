class Student{

    int id;
    String name;
    float age;


    void sleep()
    {
        System.out.println("Student is sleeping");
    }

    void study()
    {
        System.out.println("Student must study");
    }

}
public class LaunchOOP1 {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.sleep();

    }
}



public class Tstring2 
{
    // main method
    public static void main(String[] args) 
  {
        Student obj = new Student(101, "Rama");
        //obj.display();
        System.out.println(obj.getRollNumber());
        System.out.println(obj.getName());
        
        obj.setName("Ramlal");     
        System.out.println(obj.getName());
    }
}
// user class
class Student 
{
    // class level : static and non-static
    // non-static or instance variables
    private int roll_number;
    private String name;

    // static variable
    static String institute = "The Prime Step";

    // non-param constructor
    Student() 
    {
        System.out.println("Student object is created");
    }

    Student(int roll_number, String name) 
    {
        this.roll_number = roll_number;
        this.name = name;
    }

    // getter method for roll_number
    public int getRollNumber()
    {
        return this.roll_number;
    }
    // setter method for roll_number
    public void setRollNumber(int r)
    {
        this.roll_number = r;
    }

    // getter method for name
    public String getName()
    {
        return this.name;
    }
    // setter method for name
    public void setName(String name)
    {
        this.name = name;
    }
    // instance method
    public void studying() 
    {
        System.out.println("Student is studying" + this.name);
    }
    // static method
    public static void coding() 
    {
        System.out.println("Student enjoys coding");
    }
    // instance method
    public void display() 
    {
        System.out.println("Roll number = " + this.roll_number + "\n" + "Name = " + this.name);
        System.out.println("Institute: " + institute);
        System.out.println();
    }
    // static method
    public static void printInst() 
    {
        System.out.println("Institute: " + institute);
        // System.out.println("Roll number = " + this.roll_number + "\n" + "Name = " + this.name);
    }
}

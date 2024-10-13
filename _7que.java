class _7que 
{
 public static void main(String[] args) 
 {
   Student sc = new Student("Swasti",11,90);
    System.out.println(sc.getName());
    System.out.println(sc.getrollNumber());
    System.out.println(sc.getmarks());
 }    
}
class Student
{
    private String name;
    private int rollNumber;
    private int marks;

    Student(String name, int rollNumber, int marks)
    {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    String getName()
    {
        return name;
    }
    int getrollNumber()
    {
        return rollNumber;
    }
    int getmarks()
    {
        return marks;
    }
    void setName(String name)
    {
        this.name = name;
    }
    void setrollNumber(int rollNumber)
    {
        this.rollNumber = rollNumber;
    }
    void setmarks(int marks)
    {
        this.marks = marks;
    }

}


class Person 
{
       private String name;
       private int age;


       String getName()
       {
        return name;
       }
       int getAge()
       {
        return age;
       }
       void setName( String name)
       {
        this.name = name;
       }
       void setAge( int age)
       {
        this.age = age;
       }
      
}

class Employee extends Person 
{
  private double salary;

  public Employee(String name, int age , double salary)
  {
  setAge(age);
  setName(name); 
  this.salary = salary;
  }

  public String display()
  {
    return "Name: "+getName()+" Age: "+getAge()+" Salary: "+salary;
  }     
}

public class _1que 
{
 public static void main(String[] args) 
 { 
   Employee em = new Employee("swasti", 20, 50000);
   System.out.println(em.display());
 }    
}
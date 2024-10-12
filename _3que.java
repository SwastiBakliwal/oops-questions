class _3que 
{
public static void main(String args[])
{
  Dog od = new Dog();
  Cat oc = new Cat();
  od.makeSound();
  oc.makeSound();
}
}
interface Animal
{
     public void makeSound();   
}
class Dog implements Animal
{
    public void makeSound()
    {
      System.out.println("Bow Bow ........... ");
    }
}
class Cat implements Animal
{
   public void makeSound()
   {
    System.out.println("Meow Meow............");
   }
    
}
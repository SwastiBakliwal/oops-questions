class _4que 
{
  public static void main(String[] args)
  {
    Car oc = new Car();
    Bike bc = new Bike();
    oc.start();
    bc.start();
  }    
}
class Vehicle
{
   public void start()
   {
    System.out.println("Are you ready.....");
   }
}
class Car extends Vehicle
{
    public void start()
    {
        System.out.println("Car is started.....");
    }
}
class Bike extends Vehicle
{
    public void start()
    {
        System.out.println("Bike is started...... ");
    }
} 
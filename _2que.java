class _2que 
{
  public static void main(String[] args) 
  {
     Circle cr = new Circle(8);
     Rectangle rc = new Rectangle(20, 15);

     System.out.println("Circle Area: "+cr.calculateArea());
     System.out.println("Rectangle Area: "+rc.calculateArea());
  }    
}

class Shapes
{
    public double calculateArea()
    {
        return 0;
    }
}
class Circle extends Shapes
{
    private double radius;

    public Circle (double radius)
    {
        this.radius = radius;
    }

    public double calculateArea()
    {
        return 3.14*radius*radius;
    }
}
class Rectangle extends Shapes
{
    private double length;
    private double breadth;
    
    public Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    public double calculateArea()
    {
        return length*breadth;
    }
}
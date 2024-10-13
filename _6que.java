class _6que 
{
 public static void main(String[] args) 
 {
    Calculator cb = new Calculator();
    System.out.println(cb.add(23, 77));
    System.out.println(cb.add(55, 77, 11));
    System.out.println(cb.add(54.45, 11.11));
 }    
}
class Calculator
{
    //  private int num1;
    //  private int num2;
    //  private int num3;
     
    public int add(int num1,int num2)
    {
        return num1+num2;
    }
    public int add(int num1, int num2, int num3 )
    {
        return num1+num2+num3;
    }
    public double add (double num1, double num2)
    {
        return num1+num2; 
    }
}

class _5que 
{
    public static void main(String[] args) 
    {
      SBI os = new SBI();
      HDFC ho = new HDFC();
      ICICI io = new ICICI();
      os.getInterestRate();
      ho.getInterestRate();
      io.getInterestRate();  
    }
}
class Bank
{
    public void getInterestRate()
    {
       System.out.println("Interest Shown..");
    }
}
class SBI extends Bank
{
    public void getInterestRate()
    {
        System.out.println("SBI interest is 5%!");
    }
}
class HDFC extends Bank
{
    public void getInterestRate()
    {
        System.out.println("HDFC interest is 7%!");
    }
}
class ICICI extends Bank
{
    public void getInterestRate()
    {
        System.out.println("ICICI interest is 8%!");
    }
}
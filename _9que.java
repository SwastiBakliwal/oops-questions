
class BookofP
{
    private String title;
    private String author;
    private double price;

     public BookofP(String title, String author, double price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }
     
    String getTitle()
    {
        return title;
    }
    String getAuthor()
    {
        return author;
    }
    double getPrice()
    {
        return price;
    }


    void setTitle(String title)
    {
        this.title = title;
    }
    void setAuthor(String author)
    {
        this.author = author;
    }
    void setPrice(double price)
    {
        this.price = price;
    }
    public String displayDetails()
    {
        return "Title: "+getTitle()+" Author: "+getAuthor()+" Price: "+getPrice();
    }

}

public class _9que
{
  public static void main(String[] args) 
  {
    BookofP bob = new BookofP("Rich Dad Poor Dad", "Robert T.Kiyosaki", 150.00);
    System.out.println(bob.displayDetails());
  }    
}
// Question: Design a system for a library where books can be borrowed and returned. The system should handle different types of books (e.g., regular books, reference books) and users (e.g., students, teachers). Implement the following requirements:

// Create an abstract class Book with common properties like title, author, and ISBN.
// Create subclasses RegularBook and ReferenceBook that extend Book.
// Create an interface Borrowable with methods borrow() and returnBook().
// Implement the Borrowable interface in the RegularBook class.
// Create a class User with properties like name and userID.
// Create subclasses Student and Teacher that extend User.
// Implement a method to track borrowed books for each us

// Abstract class Book
abstract class Book {
    String title;
    String author;
    String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public abstract void displayInfo();
}

// Subclass RegularBook
class RegularBook extends Book implements Borrowable {
    public RegularBook(String title, String author, String ISBN) {
        super(title, author, ISBN);
    }

    @Override
    public void displayInfo() {
        System.out.println("Regular Book: " + title + " by " + author);
    }

    @Override
    public void borrow() {
        System.out.println("Borrowing regular book: " + title);
    }

    @Override
    public void returnBook() {
        System.out.println("Returning regular book: " + title);
    }
}

// Subclass ReferenceBook
class ReferenceBook extends Book {
    public ReferenceBook(String title, String author, String ISBN) {
        super(title, author, ISBN);
    }

    @Override
    public void displayInfo() {
        System.out.println("Reference Book: " + title + " by " + author);
    }
}

// Interface Borrowable
interface Borrowable {
    void borrow();
    void returnBook();
}

// Class User
class User {
    String name;
    String userID;

    public User(String name, String userID) {
        this.name = name;
        this.userID = userID;
    }

    public void displayUserInfo() {
        System.out.println("User: " + name + ", ID: " + userID);
    }
}

// Subclass Student
class Student extends User {
    public Student(String name, String userID) {
        super(name, userID);
    }
}

// Subclass Teacher
class Teacher extends User {
    public Teacher(String name, String userID) {
        super(name, userID);
    }
}

// Main class to demonstrate the system
class LibrarySystem {
    public static void main(String[] args) {
        RegularBook book1 = new RegularBook("Java Programming", "John Doe", "123456789");
        ReferenceBook book2 = new ReferenceBook("Encyclopedia", "Jane Smith", "987654321");

        Student student = new Student("Alice", "S001");
        Teacher teacher = new Teacher("Bob", "T001");

        book1.displayInfo();
        book1.borrow();
        book1.returnBook();

        book2.displayInfo();

        student.displayUserInfo();
        teacher.displayUserInfo();
    }
}

/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Ariel Wong-Edwin
 * @version 17 September
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String referenceNumber;
    private int bookBorrowed;
    private boolean CourseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean isCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        referenceNumber = "";
        bookBorrowed = 0;
        CourseText = isCourseText;
        
    }
    
    public String getAuthor(){
    return author;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void printAuthor() {
        System.out.println("Author: " + author);
    }
    
    public void printTitle () {
        System.out.println ("Title: " + title);
    }
    
    public int getPages() {
        return pages;
    }
    
    public String getReferenceNumber(){
        return referenceNumber;
    }
    
    public int getbookBorrowed() {
        return bookBorrowed;
    }
    
    public void setReferenceNumber (String ref) {
        if(referenceNumber.length() >= 3) {
            referenceNumber = ref;
            }
        else {
            System.out.println("Error!");
        }
        
    }
    
    public void borrow () {
        bookBorrowed++;
    }
    
    public boolean isCourseText() {
        return CourseText;
    }
    
    public void printInformation() {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Pages: " + pages);
        
        String referenceNumberString;
        if (referenceNumber.length() > 0) {
        referenceNumberString = referenceNumber;
        }
        else { 
                System.out.println("ZZZ ");
            }
        System.out.println("Times the book was borrowed: " + bookBorrowed);
        System.out.println("Course Text: " + (CourseText? "yes" : "No"));
        }
        
    }
    
    public class BookTest {
        
    public static void main(String[] args) {
        Book book1 = new Book("Harper Lee", "To Kill a Mockingbird", 281, false);

        book1.borrow();

        book1.setReferenceNumber("566");

        System.out.println("Book 1 Information:");
        book1.printInformation();
    }
}

        
    // Add the methods here ...
    /*
     * Accessor Method
     * Boolean statements
     * if statements
     * print statements
     * print statements
     * return methods
     */


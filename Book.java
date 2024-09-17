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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        referenceNumber = "";
        bookBorrowed = 0;
        
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
    
    public String retReferenceNumber(){
        return referenceNumber;
    }
    
    public int getBookBorrowed() {
        return bookBorrowed;
    }
    
    public void setReferenceNumber (String reference) {
        if (reference.length() >=3) {
            referenceNumber = reference;
        }
            else {
                System.out.println ("Error");
            }
    }
    
    public void borrow () {
        bookBorrowed++;
    }
    
    public void printInformation() {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Pages: " + pages);
        
        if (referenceNumber.length() > 0) {
        System.out.println("Reference Number: " + referenceNumber);
    }
            else { 
                System.out.println("ZZZ ");
            }
        System.out.println("Times the book was borrowed: " + bookBorrowed);
        }
        
    }

        
    // Add the methods here ...


/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Ariel Wong-Edwin
 * @version 13 September
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        
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
    
    public void printInformation() {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Pages: " + pages);
    }
        }
    // Add the methods here ...


public class BookSingleton {
    private String author;
    private String title;
    private static BookSingleton book;
    private static boolean isLoanOut;

    private BookSingleton() {
        author = "Gamma, Helm, Johnson, and Vilissides";
        title = "Design Pattern";
        book = null;
        isLoanOut = false;
    }

    public static BookSingleton borrowBook(){
        if (!isLoanOut){
            if (book == null){
                book = new BookSingleton();
            }
            isLoanOut = true;
            return book;
        }
        return null;
    }

    public static void returnBook(BookSingleton bookReturned){
            isLoanOut = false;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorAndTitle() {
        return getTitle() + " of " + getAuthor();
    }
}

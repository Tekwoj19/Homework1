public class Books {

    private String author;
    private String title;
    private String bookDescription;
    private String numberofpages;




    public Books(String author, String title, String bookDescription,String numberofpages) {
        this.author = author;
        this.title = title;
        this.bookDescription = bookDescription;
        this.numberofpages = numberofpages;

    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public String getNumberofpages() {
        return numberofpages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public void setNumberofpages(String numberofpages) {
        this.numberofpages = numberofpages;
    }

    @Override
    public String toString() {
        return "Books{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", bookDescription='" + bookDescription + '\'' +
                ", numberofpages='" + numberofpages + '\'' +
                '}';
    }






















}

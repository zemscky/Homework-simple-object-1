public class Book {
    private String bookName;
    Author author;
    private int publishingYear;

    public Book(String bookName, Author author, int publishingYear) {
        this.bookName = bookName;
        this.publishingYear = publishingYear;
        this.author = author;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
    public String toString () {
        return "Название книги " + this.bookName + " Автор книги " + this.author + " Год публикации " + this.publishingYear;
    }
}

public class Book {
    private String bookName;
    Author name;
    Author surname;
    private int publishingYear;

    public Book(String bookName,Author name, Author surename, int publishingYear) {
        this.bookName = bookName;
        this.publishingYear = publishingYear;
        this.name = name;
        this.surname = surname;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getYear() {
        return this.publishingYear;
    }

    public void setYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}

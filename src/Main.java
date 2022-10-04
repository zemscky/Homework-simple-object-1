public class Main {
    public static void main(String[] args) {
        Author firstAuthorBook = new Author("Stephen", "King");
        Author secondAuthorBook = new Author("John Ronald Reuel", "Tolkien");
        Book firstBook = new Book("The Boogeyman", firstAuthorBook,1978);
        Book secondBook = new Book("The Lord of the Rings", secondAuthorBook,1955);
        System.out.println("Название первой книги - " + firstBook.getBookName());
        System.out.println("Название второй книги - " + secondBook.getBookName());
        System.out.println("Издание первой книги - " + firstBook.getPublishingYear() + " год");
        System.out.println("Издание второй книги - " + secondBook.getPublishingYear() + " год");

        System.out.println("Автор первой книги - " + firstAuthorBook.getNameAuthor() + " " + firstAuthorBook.getSurnameAuthor());
        System.out.println("Автор второй книги - " + secondAuthorBook.getNameAuthor() + " " + secondAuthorBook.getSurnameAuthor());

        secondBook.setYear(1954);
        System.out.println("Издание второй книги - " + secondBook.getPublishingYear() + " год");

        System.out.println(firstBook.equals(secondBook));
    }
}

public class Main {
    public static void main(String[] args) {
        Author firstAuthorBook = new Author("Stephen", "King");
        Author secondAuthorBook = new Author("John Ronald Reuel", "Tolkien");
        Book firstBook = new Book("The Boogeyman", firstAuthorBook,1978);
        Book secondBook = new Book("The Lord of the Rings", secondAuthorBook,1955);
        System.out.println("Название первой книги - " + firstBook.getBookName() + ". " + firstAuthorBook + ". Издание книги - " + firstBook.getPublishingYear() + " год");
        System.out.println("Название второй книги - " + secondBook.getBookName() + ". " + secondAuthorBook + ". Издание книги - " + secondBook.getPublishingYear() + " год");

        System.out.println("Автор первой книги - " + firstAuthorBook.toString());
        System.out.println("Автор первой книги - " + secondAuthorBook.toString());

        secondBook.setYear(1954);
        System.out.println("Издание второй книги - " + secondBook.getPublishingYear() + " год");

        System.out.println(firstBook);
        System.out.println(secondBook);

        System.out.println(firstBook.equals(secondBook));
    }
}

public class Author {
    public String nameAuthor;
    public String surnameAuthor;

    public Author(String nameAuthor, String surnameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }
    public String getNameAuthor() {
        return this.nameAuthor;
    }
    public String getSurnameAuthor() {
        return this.surnameAuthor;
    }
    public String toString () {
        return "Имя автора " + this.nameAuthor + " Фамилия автора " + this.surnameAuthor;
    }

}

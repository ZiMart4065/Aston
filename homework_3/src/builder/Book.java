package builder;

public class Book
{
    public String title;
    public String author;
    public int year;
    public int pages;

    public Book(String title, String author, int year, int pages)
    {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    @Override
    public String toString()
    {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                '}';
    }
}

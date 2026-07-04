package builder;

public class BookBuilder
{
    private String title;
    private String author;
    private int year;
    private int pages;

    public BookBuilder setTitle(String title)
    {
        this.title = title;
        return this;
    }

    public BookBuilder setAuthor(String author)
    {
        this.author = author;
        return this;
    }

    public BookBuilder setYear(int year)
    {
        this.year = year;
        return this;
    }

    public BookBuilder setPages(int pages)
    {
        this.pages = pages;
        return this;
    }

    public Book build()
    {
        return new Book(title, author, year, pages);
    }
}
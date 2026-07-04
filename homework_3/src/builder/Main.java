package builder;

public class Main
{
    public static void main(String[] args)
    {
        Book book = new BookBuilder()
                .setTitle("SQL для чайников")
                .setAuthor("А. Тейлор")
                .setYear(2023)
                .setPages(900)
                .build();

        System.out.println(book);
    }
}
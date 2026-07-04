package decorator;

public class BasicPhone implements Phone
{
    @Override
    public void call()
    {
        System.out.println("Обычный звонок");
    }
}

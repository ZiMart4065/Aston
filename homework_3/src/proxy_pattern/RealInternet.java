package proxy_pattern;

public class RealInternet implements Internet
{
    @Override
    public void connectTo(String site)
    {
        System.out.println("Подключение к: " + site);
    }
}
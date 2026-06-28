package proxy_pattern;

import java.util.Arrays;
import java.util.List;

public class ProxyInternet implements Internet
{
    private RealInternet realInternet = new RealInternet();

    private List<String> blockedSites = Arrays.asList(
            "youtube.com",
            "instagram.com"
    );

    @Override
    public void connectTo(String site)
    {
        if (blockedSites.contains(site))
        {
            System.out.println("Доступ запрещён: " + site);
        }
        else
        {
            realInternet.connectTo(site);
        }
    }
}
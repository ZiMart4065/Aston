package chain;

public class AdminHandler extends Handler
{
    @Override
    public void handle(String role)
    {
        if (role.equals("admin"))
        {
            System.out.println("Доступ как администратор");
        }
        else
        {
            System.out.println("Доступ запрещён");
        }
    }
}

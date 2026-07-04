package chain;

public class StudentHandler extends Handler
{
    @Override
    public void handle(String role)
    {
        if (role.equals("student"))
        {
            System.out.println("Доступ как студент");
        }
        else if (next != null)
        {
            next.handle(role);
        }
    }
}

package chain;

public class TeacherHandler extends Handler
{
    @Override
    public void handle(String role)
    {
        if (role.equals("teacher"))
        {
            System.out.println("Доступ как преподаватель");
        }
        else if (next != null)
        {
            next.handle(role);
        }
    }
}
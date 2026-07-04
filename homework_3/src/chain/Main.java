package chain;

public class Main
{
    public static void main(String[] args)
    {
        Handler student = new StudentHandler();
        Handler teacher = new TeacherHandler();
        Handler admin = new AdminHandler();

        student.setNext(teacher);
        teacher.setNext(admin);

        student.handle("teacher");
    }
}
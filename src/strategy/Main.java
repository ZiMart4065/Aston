package strategy;

public class Main
{
    public static void main(String[] args)
    {
        University university = new University();

        university.setStrategy(new ExamAdmission());
        university.admitStudent("Зимфира Мартынова");

        university.setStrategy(new OlympiadAdmission());
        university.admitStudent("Пётр Иванов");
    }
}

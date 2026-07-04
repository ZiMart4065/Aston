package strategy;

public class University
{
    private AdmissionStrategy strategy;

    public void setStrategy(AdmissionStrategy strategy)
    {
        this.strategy = strategy;
    }

    public void admitStudent(String applicant)
    {
        if (strategy == null)
        {
            System.out.println("Стратегия не выбрана");
            return;
        }

        strategy.admit(applicant);
    }
}
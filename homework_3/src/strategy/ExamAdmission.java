package strategy;

public class ExamAdmission implements AdmissionStrategy
{
    @Override
    public void admit(String applicant)
    {
        System.out.println(applicant + " поступает по результатам ЕГЭ");
    }
}
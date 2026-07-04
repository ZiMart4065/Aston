package strategy;

public class OlympiadAdmission implements AdmissionStrategy
{
    @Override
    public void admit(String applicant)
    {
        System.out.println(applicant + " поступает по олимпиаде");
    }
}
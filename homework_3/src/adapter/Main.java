package adapter;

public class Main
{
    public static void main(String[] args)
    {
        SmartPhone phone = new PhoneAdapter();

        phone.makeCall("+7 999 999 66 33");
    }
}
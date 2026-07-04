package adapter;

public class PhoneAdapter implements SmartPhone
{
    private ButtonPhone buttonPhone;

    public PhoneAdapter()
    {
        this.buttonPhone = new ButtonPhone();
    }

    @Override
    public void makeCall(String number)
    {
        buttonPhone.callNumber(number);
    }
}

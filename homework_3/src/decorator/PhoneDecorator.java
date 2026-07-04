package decorator;

public class PhoneDecorator implements Phone
{
    protected Phone phone;

    public PhoneDecorator(Phone phone)
    {
        this.phone = phone;
    }

    @Override
    public void call()
    {
        phone.call();
    }
}

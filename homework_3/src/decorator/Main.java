package decorator;

public class Main
{
    public static void main(String[] args)
    {
        Phone phone = new BasicPhone();

        Phone decoratedPhone = new CameraDecorator(phone);

        decoratedPhone.call();
    }
}
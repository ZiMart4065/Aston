package decorator;

public class CameraDecorator extends PhoneDecorator
{
    public CameraDecorator(Phone phone)
    {
        super(phone);
    }

    public void takePhoto()
    {
        System.out.println("Фото сделано 📸");
    }

    @Override
    public void call()
    {
        super.call();
        takePhoto();
    }
}
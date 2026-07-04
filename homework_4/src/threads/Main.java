package threads;

public class Main
{
    public static void main(String[] args)
    {
        Object lock = new Object();
        PrinterState state = new PrinterState();

        Thread t1 = new Thread(new Printer(lock, state, 1, true));
        Thread t2 = new Thread(new Printer(lock, state, 2, false));

        t1.start();
        t2.start();
    }
}
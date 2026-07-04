package threads;

public class Printer implements Runnable
{
    private final Object lock;
    private final PrinterState state;
    private final int value;
    private final boolean myTurn;

    public Printer(Object lock, PrinterState state, int value, boolean myTurn)
    {
        this.lock = lock;
        this.state = state;
        this.value = value;
        this.myTurn = myTurn;
    }

    @Override
    public void run()
    {
        while (true)
        {
            synchronized (lock)
            {
                while (state.oneTurn != myTurn)
                {
                    try
                    {
                        lock.wait();
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }

                System.out.println(value);

                state.oneTurn = !state.oneTurn;
                lock.notifyAll();
            }
        }
    }
}
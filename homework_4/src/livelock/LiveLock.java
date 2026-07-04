package livelock;

public class LiveLock
{
    private boolean thread1Turn = true;
    private boolean thread2Turn = false;

    public void start()
    {
        Thread thread1 = new Thread(() ->
        {
            while (true)
            {
                if (thread1Turn)
                {
                    System.out.println("Поток 1: уступаю Потоку 2");

                    thread1Turn = false;
                    thread2Turn = true;

                    try
                    {
                        Thread.sleep(300);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread thread2 = new Thread(() ->
        {
            while (true)
            {
                if (thread2Turn)
                {
                    System.out.println("Поток 2: уступаю Потоку 1");

                    thread2Turn = false;
                    thread1Turn = true;

                    try
                    {
                        Thread.sleep(300);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
package deadlock;

public class DeadLock
{
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void start()
    {
        Thread thread1 = new Thread(() ->
        {
            synchronized (lock1)
            {
                System.out.println("Поток 1 захватил lock1");

                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }

                System.out.println("Поток 1 пытается захватить lock2");

                synchronized (lock2)
                {
                    System.out.println("Поток 1 захватил lock2");
                }
            }
        });

        Thread thread2 = new Thread(() ->
        {
            synchronized (lock2)
            {
                System.out.println("Поток 2 захватил lock2");

                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }

                System.out.println("Поток 2 пытается захватить lock1");

                synchronized (lock1)
                {
                    System.out.println("Поток 2 захватил lock1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
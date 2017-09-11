package Java_Advanced_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Runner2 implements Runnable
{

    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Hello " + i);
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}

class Runner extends Thread
{

    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Hello " + i);
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}

class Processor extends Thread
{
    private volatile boolean running = true;// volatile assures the variable is not cached

    @Override
    public void run()
    {
        while (running)
        {
            System.out.println("Hello");

            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public void shutdown()
    {
        running = false;
    }
}



public class Java_09_AsyncProgramming2
{
    private static Random random = new Random();

    private int count = 0;
    private static List<Integer> list1 = new ArrayList<>();
    private static List<Integer> list2 = new ArrayList<>();

    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    public  static void stageOne() throws InterruptedException
    {
        synchronized (lock1)
        {
            Thread.sleep(1);

            list1.add(random.nextInt(100));
        }

    }

    public static void stageTwo() throws InterruptedException
    {
        synchronized (lock2)
        {
            Thread.sleep(1);

            list2.add(random.nextInt(100));
        }
    }

    public static void process()
    {
        for (int i = 0; i < 1000; i++)
        {
            try
            {
                stageOne();
                stageTwo();
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
        /*
         * A computer can run many processes at once
         *  - But single core CPU can execute one instruction at a time
         *  - Parellelism is achieved by the operating system's scheduler
         *      - Grants each process a small interval of time to run
         *
         * Multithreading
         *  - Processes have threads(at lest a main thread)
         *  - Similar to OS Multi-Tasking
         *  - By swtiching between threads, a process can do multiple tasks
         *    "at the same time"
         *
         * Threads
         *  - a thread executes a task
         *  - a thread can start other threads
         *
         * Tasks
         *  - a task is a block of code that is executed by a Thread
         *  - a task in Java is represented by the Runnable class
         *
         *
         *
         * Multi-Threaded code
         *
         * Two main benefits
         *  - responsive user interface(UI)
         *  - better CPU utilization
         */

        /*
         * First way
         */
        Runner runner1 = new Runner();
        //runner1.start();
        Runner runner2 = new Runner();
        //runner2.start();

        /*
         * Second way
         */
        Thread t1 = new Thread(new Runner2());
        Thread t2 = new Thread(new Runner2());
        //t1.start();
        //t2.start();

        /*
         * Third way
         */

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                for (int i = 0; i < 10; i++)
                {
                    System.out.println("Hello " + i);
                    try
                    {
                        Thread.sleep(100);
                    }
                    catch (InterruptedException e)
                    {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        });
        //t3.start();

        /*
         * Fourth way
         */
        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 10; i++)
            {
                System.out.println("Hello " + i);
                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        //t4.start();

        Processor proc1 = new Processor();
        //proc1.start();
        System.out.println("Press return to stop ...");
        Scanner sc = new Scanner(System.in);
        //sc.hasNextLine();

        //proc1.shutdown();

        // synchronized
        Java_09_AsyncProgramming2 app = new Java_09_AsyncProgramming2();
        app.doWork();

        // lock
        System.out.println("Hello.");

        System.out.println("Starting ...");
        long start = System.currentTimeMillis();

        Thread t6 = new Thread(new Runnable()
        {

            @Override
            public void run()
            {
                process();
            }
        });
        Thread t7 = new Thread(new Runnable()
        {

            @Override
            public void run()
            {
                process();
            }
        });
        t6.start();
        t7.start();
        t6.join();
        t7.join();

        long end = System.currentTimeMillis();
        System.out.println("Ending ...");

        System.out.println("Time taken: " + (end - start));
        System.out.println("List1: " + list1.size() + "; List2: " + list2.size());
     }

    public void doWork() throws InterruptedException
    {
        Thread t1 = new Thread(new Runnable()
        {

            @Override
            public void run()
            {
                for (int i = 0; i < 10000; i++)
                {
                    increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable()
        {

            @Override
            public void run()
            {
                for (int i = 0; i < 10000; i++)
                {
                    increment();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join(); // waits to finish t1
        t2.join(); // waits to finish t2
        System.out.println("Count is: " + count);


    }

    private static Object lock3 = new Object();

    public  void increment()
    {
        synchronized (lock3)
        {
            count++;
        }

    }
}





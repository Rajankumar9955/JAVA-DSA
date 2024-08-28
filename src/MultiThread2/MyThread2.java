package MultiThread2;

public class MyThread2 implements  Runnable{

    public void run()
    {
        for(int i=50; i>=1; --i)
        {
            System.out.println("MyThread2");
            System.out.println(i);
            try {
                Thread.sleep(500);
            }catch ( InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

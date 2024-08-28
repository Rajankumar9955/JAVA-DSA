package MultiThread2;

public class MyThread extends Thread{

    public void run()
    {
        for(int i=1; i<=50; ++i)
        {
            System.out.println("MyThread");
            System.out.println(i);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

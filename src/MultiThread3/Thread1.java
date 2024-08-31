package MultiThread3;

public class Thread1 extends  Thread{
    @Override
    public void run()
    {
        for(int i=0; i<5; ++i)
        {
            System.out.println("Thread1");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

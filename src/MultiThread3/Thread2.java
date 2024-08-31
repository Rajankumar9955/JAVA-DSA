package MultiThread3;

public class Thread2 implements Runnable{
@Override
   public void run()
   {
       String name=Thread.currentThread().getName();
       for(int i=0; i<=3;++i)
       {
           System.out.println(name);
           try {
               Thread.sleep(1000);
           }catch (InterruptedException e)
           {
               e.printStackTrace();
           }
       }

   }
}

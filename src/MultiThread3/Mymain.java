package MultiThread3;

public class Mymain {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        Runnable task=new Thread2();

        Thread t2=new Thread(task);
        t2.setName("Rajan");
        t1.setPriority(t1.MIN_PRIORITY);
        t2.setPriority(t2.MAX_PRIORITY);
        t2.start();
        t1.start();
    }
}

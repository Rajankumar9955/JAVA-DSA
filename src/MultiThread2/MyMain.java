package MultiThread2;

public class MyMain {
    public static void main(String[] args) {
        MyThread thread1=new MyThread();
        Runnable task=new MyThread2();

        Thread thread2=new Thread(task);

        thread1.setPriority(1);
        thread2.setPriority(thread2.MAX_PRIORITY);

        thread1.start();
        thread2.start();
    }
}

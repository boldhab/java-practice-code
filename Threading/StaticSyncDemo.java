package Threading;
class StaticCounter {
    private static int count = 0;

    // Static synchronized method
    public static synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " incremented static count: " + count);
    }
}

 public class StaticSyncDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(StaticCounter::increment, "Thread-1");
        Thread t2 = new Thread(StaticCounter::increment, "Thread-2");
        Thread t3 = new Thread(StaticCounter::increment, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}

package Threading;
class Counter {
    private int count = 0;
    private final Object lock = new Object(); // custom lock object

    public void increment() {
        System.out.println(Thread.currentThread().getName() + " attempting to increment...");

        synchronized (lock) {  // critical section
            count++;
            System.out.println(Thread.currentThread().getName() + " incremented count: " + count);
        }

        System.out.println(Thread.currentThread().getName() + " finished incrementing.");
    }
}

public class SyncBlockDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread(counter::increment, "Thread-A");
        Thread t2 = new Thread(counter::increment, "Thread-B");

        t1.start();
        t2.start();
    }
}

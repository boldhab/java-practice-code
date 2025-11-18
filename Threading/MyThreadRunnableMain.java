package Threading;

// Class implementing Runnable
class MyThreadRunnable implements Runnable {
  
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // Handle interruption
            }
        }
    }
}

// Another class implementing Runnable
class YourThread implements Runnable {
   
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // Handle interruption
            }
        }
    }
}

public class MyThreadRunnableMain {
    public static void main(String[] args) {
        // Create Runnable objects
        MyThreadRunnable obj1 = new MyThreadRunnable();
        YourThread obj2 = new YourThread();

        // Pass Runnable objects to Thread constructors
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // Start the threads
        t1.start();
        t2.start();
    }
}

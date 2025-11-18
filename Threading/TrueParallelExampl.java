
package Threading;
class A extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hi " + i);
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello " + i);
        }
    }
}

public class TrueParallelExampl {
    public static void main(String[] args) {
        A t1 = new A();
        B t2 = new B();

        t1.start();
        t2.start();
    }
}

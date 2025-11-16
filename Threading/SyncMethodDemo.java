package Threading;
class BankAccount {
    private int balance = 1000;

    // Synchronized instance method
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited: " + amount + " | Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " withdrew: " + amount + " | Balance: " + balance);
    }
}

public class SyncMethodDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> account.deposit(500), "Thread-1");
        Thread t2 = new Thread(() -> account.withdraw(200), "Thread-2");

        t1.start();
        t2.start();
    }
}

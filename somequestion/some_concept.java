public class MultiThreadExample extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }

public class MultiTaskingExample implements Runnable {
    private String task;

    public MultiTaskingExample(String task) {
        this.task = task;
    }

    public void run() {
        System.out.println(task + " is running by " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MultiTaskingExample("
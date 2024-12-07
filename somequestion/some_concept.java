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


public class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running using Thread class.");
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
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

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class SyncExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.getCount());
    }
}


public class ThreadLifecycle extends Thread {
    public void run() {
        try {
            System.out.println("Thread is running...");
            Thread.sleep(1000); // Simulating waiting state
            System.out.println("Thread is terminated.");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }

    public static void main(String[] args) {
        ThreadLifecycle thread = new ThreadLifecycle();
        System.out.println("Thread state: " + thread.getState());
        thread.start();
        System.out.println("Thread state after start: " + thread.getState());
    }
}
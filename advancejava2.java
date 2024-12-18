import java.util.*;

public class TimerExample {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                System.out.println("Task executed!");
            }
        }, 1000, 2000);
    }
}
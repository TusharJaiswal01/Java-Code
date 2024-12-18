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

import java.lang.reflect.*;

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("java.util.ArrayList");
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}
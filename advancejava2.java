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





public class GenericExample<T> {
    private T obj;

    public void set(T obj) {
        this.obj = obj;
    }

    public T get() {
        return obj;
    }

    public static void main(String[] args) {
        GenericExample<String> example = new GenericExample<>();
        example.set("Generics in Java");
        System.out.println(example.get());
    }
}



import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> {
            Thread.sleep(1000);
            return 42;
        });
        System.out.println("Result: " + future.get());
        executor.shutdown();
    }
}



enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumExample {
    public static void main(String[] args) {
        for (Days day : Days.values()) {
            System.out.println(day);
        }
    }
}



import java.util.*;
import java.util.stream.*;

public class StreamsExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);
    }
}



import java.util.regex.*;

public class RegexExample {
    public static void main(String[] args) {
        String text = "Java is fun!";
        Pattern pattern = Pattern.compile("Java");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("Found: " + matcher.group());
        }
    }
}


import java.io.*;

class Person implements Serializable {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SerializationExample {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.dat"));
        out.writeObject(new Person("Alice", 30));
        out.close();
    }
}

import java.io.*;

public class DeserializationExample {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.dat"));
        Person p = (Person) in.readObject();
        System.out.println(p.name + " - " + p.age);
        in.close();
    }
}
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

public class Sum {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Sum: " + (a + b));
    }
}



public class EvenOdd {
    public static void main(String[] args) {
        int num = 7;
        System.out.println(num % 2 == 0 ? "Even" : "Odd");
    }
}


public class Factorial {
    public static void main(String[] args) {
        int n = 5, fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        System.out.println("Factorial: " + fact);
    }
}
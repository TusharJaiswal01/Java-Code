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

public class PrimeCheck {
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}

public class ReverseString {
    public static void main(String[] args) {
        String str = "Java";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
    }
}


public class Palindrome {
    public static void main(String[] args) {
        String str = "radar";
        System.out.println(str.equals(new StringBuilder(str).reverse().toString()) ? "Palindrome" : "Not Palindrome");
    }
}


public class VowelCount {
    public static void main(String[] args) {
        String str = "hello";
        long count = str.chars().filter(c -> "aeiou".indexOf(c) != -1).count();
        System.out.println("Vowels: " + count);
    }
}
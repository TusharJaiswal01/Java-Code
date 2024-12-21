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


public class StringToInt {
    public static void main(String[] args) {
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num + 1);
    }
}

public class StringToInt {
    public static void main(String[] args) {
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num + 1);
    }
}


public class RemoveWhitespace {
    public static void main(String[] args) {
        String str = "Java Programming";
        System.out.println(str.replaceAll("\\s", ""));
    }
}


public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, count = 10;
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}



public class NumberPyramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}



public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}


public class SumOfDigits {
    public static void main(String[] args) {
        int num = 1234, sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum: " + sum);
    }
}
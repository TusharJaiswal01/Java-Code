public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}


import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
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
        
        System.out.println(num + " is " + (isPrime ? "prime" : "not prime"));
    }
}



public class ReverseString {
    public static void main(String[] args) {
        String input = "hello";
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string: " + reversed);
    }
}

public class Factorial {
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));
    }
}




public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 30};
        int max = arr[0];

        for (int num : arr) {
            if (num > max) max = num;
        }

        System.out.println("Largest element: " + max);
    }
}
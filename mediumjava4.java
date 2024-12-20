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



public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(str + " is " + (str.equals(reversed) ? "a palindrome" : "not a palindrome"));
    }
}






public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
    }
}





public class Fibonacci {
    public static void main(String[] args) {
        int n = 10, a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + ", " + b);

        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }
    }
}





import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        int index = Arrays.binarySearch(arr, target);
        System.out.println("Element found at index: " + index);
    }
}






public class LeapYear {
    public static void main(String[] args) {
        int year = 2024;
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + " is " + (isLeap ? "a leap year" : "not a leap year"));
    }
}





public class GCD {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println("GCD of 54 and 24: " + gcd(54, 24));
    }
}






public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{2, 0}, {1, 2}};
        int[][] result = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        for (int[] row : result) {
            System.out.println(java.util.Arrays.toString(row));
        }
    }
}
public class ArraySum {
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sumArray(arr)); // 15
    }
}





public class DigitCounter {
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countDigits(12345)); // 5
    }
}





public class StringToInt {
    public static int convert(String str) {
        return Integer.parseInt(str);
    }
    public static void main(String[] args) {
        System.out.println(convert("123")); // 123
    }
}




public class MaxInArray {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8};
        System.out.println(findMax(arr)); // 8
    }
}



public class PalindromeNumber {
    public static boolean isPalindrome(int num) {
        int original = num, reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return original == reversed;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121)); // true
        System.out.println(isPalindrome(123)); // false
    }
}



public class PowerCalculation {
    public static int power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }
    public static void main(String[] args) {
        System.out.println(power(2, 3)); // 8
    }
}




public class EvenOdd {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    public static void main(String[] args) {
        System.out.println(isEven(10)); // true
        System.out.println(isEven(15)); // false
    }
}



public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num < largest) {
                second = num;
            }
        }
        return second;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8};
        System.out.println(findSecondLargest(arr)); // 7
    }
}




public class FibonacciSeries {
    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
    }
    public static void main(String[] args) {
        printFibonacci(10); // 0 1 1 2 3 5 8 13 21 34
    }
}





public class PrimeNumber {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(7)); // true
        System.out.println(isPrime(10)); // false
    }
}






public class ReverseString {
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(reverse("hello")); // "olleh"
    }
}



public class ArmstrongNumber {
    public static boolean isArmstrong(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }
        return sum == num;
    }
    public static void main(String[] args) {
        System.out.println(isArmstrong(153)); // true
    }
}



public class ReverseWords {
    public static void main(String[] args) {
        String str = "Hello World";
        String[] words = str.split(" ");
        String reversed = String.join(" ", new StringBuilder(words[1]).reverse(), new StringBuilder(words[0]).reverse());
        System.out.println("Reversed words: " + reversed);
    }
}



public class IsDigitOnly {
    public static void main(String[] args) {
        String str = "12345";
        System.out.println(str.matches("\\d+") ? "Only digits" : "Contains non-digit characters");
    }
}
public class Palindrome {
    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam")); // true
        System.out.println(isPalindrome("hello")); // false
    }
}


public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(binarySearch(arr, 4)); // 3
    }
}






public class WordCounter {
    public static int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) return 0;
        return sentence.split("\\s+").length;
    }
    public static void main(String[] args) {
        System.out.println(countWords("Hello world! Java is fun.")); // 5
    }
}



public class SumOfDigits {
    public static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumDigits(1234)); // 10
    }
}




public class ReverseInteger {
    public static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(reverse(1234)); // 4321
    }
}








public class LeapYear {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static void main(String[] args) {
        System.out.println(isLeapYear(2024)); // true
        System.out.println(isLeapYear(2023)); // false
    }
}
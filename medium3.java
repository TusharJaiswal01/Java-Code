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
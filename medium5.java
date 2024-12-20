public class WordCount {
    public static void main(String[] args) {
        String str = "Hello world, welcome to Java.";
        int wordCount = str.split("\\s+").length;
        System.out.println("Number of words: " + wordCount);
    }
}public class Armstrong {
    public static void main(String[] args) {
        int num = 153, sum = 0, temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }

        System.out.println(num + " is " + (sum == num ? "an Armstrong number" : "not an Armstrong number"));
    }
}


import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(str1 + " and " + str2 + " are " + 
            (Arrays.equals(arr1, arr2) ? "anagrams" : "not anagrams"));
    }
}



public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;

        for (int num : arr) {
            sum -= num;
        }

        System.out.println("Missing number: " + sum);
    }
}

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};
        int[] result = new int[a.length + b.length];

        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        Arrays.sort(result);

        System.out.println("Merged array: " + Arrays.toString(result));
    }
}
public class Armstrong {
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
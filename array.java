public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {2, 8, 1, 4};
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
    }
}

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}


import java.util.Arrays;
public class ArrayEquality {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println(Arrays.equals(arr1, arr2));
    }
}

import java.util.*;
public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2};
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {
                System.out.println("Duplicate: " + num);
            }
        }
    }
}



import java.util.Arrays;
public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
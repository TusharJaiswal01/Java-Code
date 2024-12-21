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
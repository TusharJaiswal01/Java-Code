public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {2, 8, 1, 4};
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
    }
}
  import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
     
        System.out.println("Enter the number of elements for the first array:");
        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];
        System.out.println("Enter " + n1 + " elements for the first array:");
        for (int i = 0; i < n1; i++) {
            array1[i] = scanner.nextInt();
        }
        
    // for second array 
        System.out.println("Enter the number of elements for the second array:");
        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];
        System.out.println("Enter " + n2 + " elements for the second array:");
        for (int i = 0; i < n2; i++) {
            array2[i] = scanner.nextInt();
        }
        
        // for  merging two arrays
        int[] mergedArray = mergeArrays(array1, array2);
        

        Arrays.sort(mergedArray);
        
    
        System.out.println("Merged and sorted array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
    

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        int i = 0;
        for (int num : array1) {
            result[i++] = num;
        }
        for (int num : array2) {
            result[i++] = num;
        }
        return result;//here result return in variable
    }
}

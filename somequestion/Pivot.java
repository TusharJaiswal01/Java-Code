public class Pivot {
    public static void main(String[] args) {
        int array[] = {1, 7, 3, 9, 1, 3, 7};
        int totalSum = 0;
        int leftSum = 0;

  
        for (int i = 0; i < array.length; i++) {
            totalSum += array[i];
        }
//iteration   
       
        for (int i = 0; i < array.length; i++) {
           
            int rightSum = totalSum - leftSum - array[i];

          
            if (leftSum == rightSum) {
                System.out.println("Pivot found at index: " + i);
                return; 
            }

            
            leftSum += array[i];//here sum store and next iterate
        }

       
        System.out.println("No pivot found where left sum equals right sum.");
    }
}

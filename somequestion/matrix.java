public class matrix {
    



    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int target = 5;
        int i=0;
        int j=matrix[0].length-1;
        int count=0;
        while(i<matrix.length && j>=0){
            if(matrix[i][j]==target){
                count++;
                i++;
                j--;
            }else if(matrix[i][j]<target){
                i++;
            }else{
                j--;
            }
        }
        System.out.println(count);
    }
}

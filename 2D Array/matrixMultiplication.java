public class matrixMultiplication{
    public static void main (String[] args)
    {
        // int [] arr1 = {10,20,30};  array Multiplication
        // int [] arr2 = {10,20,30};
        // int [] multiple=new int[arr1.length];

        // for (int i = 0;i<arr1.length;i++)
        // {
        //     multiple[i] = arr1[i]*arr2[i];
        // }
        // for (int i = 0;i<arr1.length;i++)
        // {
        //     System.out.println(multiple[i]);
        // }
    int[][] arr1 = {
        {10, 20, 30},
        {1, 2, 3}
    };
// matrix multiplication does not work for 2x3 and 2x3
    int[][] arr2 = {
        {10, 20, 30},
        {1, 2, 3}
    };

    int[][] result = new int[arr1.length][arr2[0].length];

    for (int i = 0; i < arr1.length; i++) {          // rows of A
        for (int j = 0; j < arr2[0].length; j++) {   // columns of B
            for (int k = 0; k < arr1[0].length; k++) { // columns of A
                result[i][j] += arr1[i][k] * arr2[k][j]; // here in arr1 k increases first so i = 0 k = 1,2,3.. and then j also same happens
            }   // We wanted row of a so i=0 row stays same but col changes and then we need col of arr2 k changes row does but col stays same  
        }
    }
    for (int i = 0;i<arr1.length;i++)
    {
        for (int j = 0;j<arr1.length;j++)
        {
            System.out.print(result[i][j] +" ");
        }
        System.out.println();
    }
    }
}
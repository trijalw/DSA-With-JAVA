// 1 2 3 4
// 12 13 14 5
// 11 16 15 6
// 12 9 8 7   given print 1 2 3 4 5 6 7 8 9...




public class spiral {
    public static void main (String[] args)
    {
        int [][] arr=
        {
            {1,2,3,4},
            {12,13,14,5},
            {11,16,15,6},
            {10,9,8,7}
        };
        int right = arr.length-1;
        int bottom = arr[0].length-1;
        int top = 0;
        int left = 0;
        while (top<=bottom && left<=right){
            for (int j = left;j<=right;j++)
            {
                System.out.print(arr[top][j]+" ");
            }
            top++;
            for (int k = top;k<=bottom;k++ )
            {
                System.out.print(arr[k][right]+" ");
            }
            right--;
            for (int z=right;z>=left;z--)
            {
                System.out.print(arr[bottom][z]+" ");
            }
            bottom--;
            for (int i =bottom;i>=top;i--)
            {
                System.out.print(arr[i][left]+" ");
            }
            left++;
        }
    }
}


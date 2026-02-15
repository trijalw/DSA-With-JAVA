import java.util.*;

public class sumofElements {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][]matrix  = new int[rows][cols];

        // arr = new int[2][3];

        int sum = 0;
        for (int i = 0;i<rows;i++)
        {
            for (int j = 0;j<cols;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0;i<rows;i++)
        {
            for (int j = 0;j<cols;j++)
            {
                System.out.print(matrix[i][j] +" ");
                sum += matrix[i][j];
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}

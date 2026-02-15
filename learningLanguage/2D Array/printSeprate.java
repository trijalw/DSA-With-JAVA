import java.util.*;
public class printSeprate {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which row does user want to print");
        int a = sc.nextInt();
        int b = a-1;
        System.out.println("Enter no of rows");
        int rows = sc.nextInt();
        System.out.println("Enter no of cols");
        int cols = sc.nextInt();
        int [][] matrix  = new int[rows][cols];
        for (int i = 0;i<rows;i++)
        {
            for (int j = 0;j<cols;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int j = 0;j<cols;j++)
        {
            System.out.print(matrix[b][j]+" ");
        }
    }
}


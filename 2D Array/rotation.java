import java.util.*;

public class rotation {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int row = sc.nextInt();
        System.out.println("Enter no of coloumns");
        int col = sc.nextInt();
        int [][] n = new int[row][col];


        for (int i = 0;i<row;i++)
        {
            for (int j = 0;j<col;j++)
            {
                System.out.println("Enter the element at the position "+i+" "+j );
                n[i][j] = sc.nextInt();
            }
        }


        for (int i = 0;i<row;i++)
        {
            for (int j = 0;j<col;j++)
            {
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }
        
        
        for (int i = 0 ;i<col;i++ )
        {
            for (int j = row-1;j>=0;j--)
            {
                System.out.print(n[j][i]+" ");
            }
            System.out.println();
        }
    }
}

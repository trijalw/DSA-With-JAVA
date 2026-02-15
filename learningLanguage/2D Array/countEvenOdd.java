import java.util.*;

public class countEvenOdd {
    public static void main (String[] args)
    {
        int oddCount = 0;
        int evenCount = 0;
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] matrix = new int[rows][cols];
        for (int  i = 0;i<rows;i++)
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
                if (matrix[i][j] % 2 ==0)
                {
                    evenCount++;
                }
                else
                {
                    oddCount++;
                }
            }
        }
        System.out.println("There are "+oddCount+" Odd numbers"+" and they are "+evenCount+" Even numbers ");
    }
}

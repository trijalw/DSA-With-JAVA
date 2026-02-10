import java.util.*;

public class searchElement {
    public static void main (String[] args)
    {
        int correct = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row = sc.nextInt();
        System.out.println("Enter number of coloumns");
        int col = sc.nextInt();
        int [][] n = new int[row][col];
        System.out.println("Enter element you want to search");
        int element = sc.nextInt();
        
        for (int i = 0;i<row ;i++)
        {
            for (int j = 0;j<col;j++)
            {
                System.out.println("Enter the element at the position "+i+j);
                n[i][j] = sc.nextInt();
                
            }
        }
        for (int i = 0;i<row;i++)
        {
            for (int j = 0;j<col;j++)
            {
                if(element == n[i][j])
                {
                        System.out.println("The position of element is : "+ i+j);
                        correct = 1;
                }
            }
        }
        
        if (correct == 0)
        {
            System.out.println("The element is not present");
        }
    }
}

import java.util.*;

public class largestAndSmallestElement {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row = sc.nextInt();
        System.out.println("Enter no of coloums");
        int col = sc.nextInt();
        int [][] n = new int[row][col];


        for (int i =0;i<row;i++)
        {
            for (int j = 0;j<col;j++)
            {
                System.out.println("Enter the element at postion"+i+j+" ");
                n[i][j] = sc.nextInt();
            }
        }

        int largest = n[0][0];
        int smallest = n[0][0];

        for (int i = 0;i<row;i++)
        {
            for (int j = 0;j<col;j++)
            {
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }

        for (int i =0;i<row;i++)
        {
            for (int j =0;j<col;j++)
            {
                if(smallest>n[i][j])
                {
                    smallest = n[i][j];
                }

                if (n[i][j]>largest)
                {
                    largest = n[i][j];
                }
            }
        }

        System.out.println("The Largest Elements is : "+largest+" The Smallest Element is : "+smallest);
    }
}

// import java.util.*;


// public class sumOfMatrix {
//     public static void main (String []args)
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number of rows in the arrays");
//         int row = sc.nextInt();
//         System.out.println("Enter number of coloumns in the arrays");
//         int col = sc.nextInt();
//         int [][] n = new int [row][col];

//         int [][] b = new int [row][col];

//         for (int i = 0;i<row;i++)
//         {
//             for (int j = 0;j<col;j++)
//             {
//                 System.out.println("Enter the element for array one at the position : "+i+j);
//                 n[i][j] = sc.nextInt();
//                 System.out.println("Enter the element for array two at the position : "+i+j);
//                 b[i][j] = sc.nextInt();    
//             }
//         }
        
        
//         for (int i = 0;i<row;i++)
//         {
//             for (int j = 0;j<col;j++)
//             {
//                 System.out.print(n[i][j]+" ");
//             }
//             System.out.println();
//         }



//         for (int i = 0;i<row;i++)
//         {
//             for (int j = 0;j<col;j++)
//             {
//                 System.out.print(b[i][j]+" ");
//             }
//             System.out.println();
//         }

//         for (int i =0;i<row;i++)
//         {
//             for (int j = 0;j<col;j++)
//             {
//                 n[i][j] = n[i][j] + b[i][j];
//                 System.out.print(n[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }


//Subtaction


import java.util.*;


public class sumOfMatrix {
    public static void main (String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows in the arrays");
        int row = sc.nextInt();
        System.out.println("Enter number of coloumns in the arrays");
        int col = sc.nextInt();
        int [][] n = new int [row][col];

        int [][] b = new int [row][col];

        for (int i = 0;i<row;i++)
        {
            for (int j = 0;j<col;j++)
            {
                System.out.println("Enter the element for array one at the position : "+i+j);
                n[i][j] = sc.nextInt();
                System.out.println("Enter the element for array two at the position : "+i+j);
                b[i][j] = sc.nextInt();    
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



        for (int i = 0;i<row;i++)
        {
            for (int j = 0;j<col;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        for (int i =0;i<row;i++)
        {
            for (int j = 0;j<col;j++)
            {
                n[i][j] = n[i][j] - b[i][j];
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }
    }
}
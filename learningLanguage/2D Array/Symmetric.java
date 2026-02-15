public class Symmetric {
    public static void main (String[] args)
    {
        int[][] n = {
            {1,2,3},
            {4,5,6},
            {10,11,12}
        };
        int correct = 1;
        if (n.length != n[0].length)
        {
            System.out.println("Not a symmetric matrix");
        }
        else
        {    
        for (int i = 0;i<n.length;i++)
        {
            for (int j = i+1;j<n.length;j++)
            {
                if (n[i][j] != n[j][i])
                {
                    correct = 0;
                    break;
                }
                
            }
        }
        if (correct == 0)
        {
            System.out.println("Not Symmetric");
        }
        if (correct == 1)
        {
            System.out.println("Yes it is Symmetric");
        }
    }
    }
}

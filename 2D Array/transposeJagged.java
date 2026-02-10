public class transposeJagged {
    public static void main (String[] args)
    {
        int [][] n = {
            {1,2},
            {10,20},
            {1,2},
            {7,8} 
        };
        int maxCols=0;
        for (int i = 0;i<n.length;i++)
        {
            if (maxCols<n[i].length)
            {
                maxCols = n[i].length;
            }
        }
        for (int i = 0;i<maxCols;i++)
        {
            for (int j = 0;j<n.length;j++)
            {
                if(i< n[j].length)
                {
                    System.out.print(n[j][i]+" ");
                }
                else 
                {
                    System.out.print("  ");
                }
               
            }
            System.out.println();
        }
    }
}

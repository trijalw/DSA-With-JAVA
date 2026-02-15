
public class colWithMinSum {
    public static void main (String[] args)
    {
        int [][] n = {
            {1,2,3},
            {4,0,6},
            {7,8,9}
        };

        int sum = 0;
        int minSum  = Integer.MAX_VALUE;
        int count =0;
        for (int i = 0;i<n.length;i++)
        {
            for (int j = 0;j<n[i].length;j++)            // n[i] means that row specific length
            {
                sum +=n[i][j]; 
            }
            if (minSum > sum)
            {
                minSum = sum;
                count ++;
            }
        }
        System.out.println(minSum);
    }
}

// do at hostel
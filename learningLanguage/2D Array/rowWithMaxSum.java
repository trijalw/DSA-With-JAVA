public class rowWithMaxSum {
    public static void main (String []args)
    {
        int[][] n = {
            {-1,2,-3},
            {-4,3,-2},
            {1,3,-5}
        };
        
        int largestSum = -999;
        int a = 0;
        int count = 0;
        int c = 0;
        while (a<n.length)
        {
            int sum = 0;
            for (int i =0;i<n[0].length;i++)
            {
                sum += n[a][i];
            }
            if (largestSum<sum){
                count ++;
                largestSum = sum;
            }
            if (largestSum == sum){
                c=1;
            }
            a++;
        }
        if(c==1)
            System.out.println("Two rows have the same sum so no largest sum");
        else
            System.out.println(largestSum+" "+"the "+count+" is the largest row");
    }
}

// Two not largest row have same sum then what to do?
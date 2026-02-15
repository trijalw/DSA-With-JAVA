public class transpose {
    public static void main (String[] args)
    {
        int[][] n = {
            {10,2,3},
            {4,5,6},
            {7,8,9}
        };
        for (int i = 0;i<n[0].length;i++)
        {
            for (int j = 0;j<n.length;j++)
            {
                System.out.print(n[j][i] +" " );
            }
            System.out.println();
        }
    }
}


// Remember one thing n[0].length is coloumn lenght and n.length is row length

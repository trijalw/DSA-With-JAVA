
public class EvenThenOdd {
    public static void main (String[] args)
    {
        int index = 0;
        int[] n = {1,2,3,4,5,6,7,8,9,0};
        int [] temp = new int[n.length];
        for (int i = 0;i<n.length;i++)
        {
            if (n[i]%2==0)
            {
                temp[index] = n[i];
                index++;
            }
        }
        for (int i = 0;i<n.length;i++)
        {
            if (n[i]%2!=0)
            {
                temp[index] = n[i];
                index++;
            }
        }



        
        for (int i = 0;i<n.length;i++)
        {
            System.out.println(temp[i]);
        }
    }
}

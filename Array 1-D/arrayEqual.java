import java.util.Arrays;

public class arrayEqual {
    public static void main (String [] args)
    {
        int [] n = {1,2,3,4,5};
        Arrays.sort(n);
        int [] a = {5,4,3,2,1};
        Arrays.sort(a);

        if (!(n.length == a.length)){
            System.out.println("Arrays have different size , so they can not be equal");
        }
        int temp = 0;
        for (int i= 0;i<n.length;i++)
        {
            temp = 0;
            if (n[i] == a[i])
            {
                temp = 1;
            }
        }
        if (temp ==1)System.out.println("Arrays are equal");
        else System.out.println("The Arrays is not equal but of same size ");
    }
}

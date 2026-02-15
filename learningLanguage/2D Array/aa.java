import java.util.*;

public class aa{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] n = new int[size];

        for (int i =0;i<size;i++) {
            n[i] = sc.nextInt();           // enhanced loop does not change the value n[1]
        }
        for (int value:n)
        {
            System.out.print(value + " ");
        }
    }
}



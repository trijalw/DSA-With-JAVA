import java.util.*;
public class duplicateRemover {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] n = new int [size];
        int count = 0;
        for (int i = 0;i<size;i++) 
        {
            System.out.println("Enter the element at "+(i+1));
            n[i] = sc.nextInt();
        }
        for (int i = 0;i<size;i++)
        {
            boolean isDuplicate = false;
            for (int j = 0 ;j<count;j++)
            {
                if (n[i] == n[j])
                {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate == false)
            {
                n[count] = n[i];
                count++;
            }
        }
        
        for (int i = 0; i < count; i++) {
            System.out.println(n[i] +" ");
        }
    }
}


// other way 2 different arrays create a unique array same process
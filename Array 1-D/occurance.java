import java.util.Scanner;

public class occurance {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] n = new int[size];
        int [] occurence = new int[size];
        for (int i = 0 ;i<size;i ++)
        {
            n[i] = sc.nextInt();
        }
        for (int i = 0;i<size -1 ;i++)
        {
            int count = 1;
            for (int j = i+1;j<size;j++)
            {
                if(n[i] == n[j])
                {
                    count++;
                    
                }
            }
            occurence[i] = count;
        }

    }
}

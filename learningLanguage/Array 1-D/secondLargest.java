import java.util.Scanner;

public class secondLargest {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []n = new int[size];
        int largest=0;
        int secondLargest=0;

        for (int i = 0;i<size;i++)
        {
            n[i] = sc.nextInt();
        }
        for (int i = 0;i<size;i++)
        {
            if (largest<n[i])
            {
                secondLargest = largest;
                largest = n[i];
                
            }
            else if (secondLargest<n[i] && largest >n[i])
            {
                secondLargest = n[i];
            }

        }
        System.out.print(secondLargest);
        
    }
}

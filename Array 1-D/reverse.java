import java.util.Scanner;

public class reverse {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []n = new int[size];

        for (int i = 0;i<n.length;i++)
        {
            n[i] = sc.nextInt();
        }
        for (int i = n.length-1;i>=0;i--)
        {
            System.out.println(n[i]);
        }
    }
}

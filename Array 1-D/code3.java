//Sum of array

import java.util.Scanner;
public class code3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] n = new int[size];
        for (int i = 0;i<n.length;i++)
        {
            System.out.println("Enter "+(i+1)+" array element");
            n[i] =  sc.nextInt();
        }
        int sum = 0;
        for (int i = 0;i<n.length;i++)
        {
            sum = sum+n[i];
            // System.out.println(sum);
            n[i]=sum;
            System.out.println(n[i]);

        }
    }
}
// to change array arr[i] = sum
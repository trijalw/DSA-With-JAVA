import java.util.Scanner;

public class maxProductofTwoElements {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] n = new int [size];

        for (int i = 0;i<size;i++)
        {
            System.out.println("Enter the " +(i+1)+" Element");
            n[i] = sc.nextInt();
        }
        int multiply = Integer.MIN_VALUE;
        int index = 0;
        for (int i =0;i<size-1;i++)
        {
            int temp = n[i] * n[i+1];
            if (multiply<temp)
            {
                index = i;
                multiply = temp;
            }
        }
            int index2 = index+1;
            int index3 = index+2;
            System.out.println(multiply +"  is b/w is " +index2 + " and " +index3 +" element");
        
    }
}
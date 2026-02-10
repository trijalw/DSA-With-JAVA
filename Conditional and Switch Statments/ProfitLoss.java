import java.util.Scanner;

public class ProfitLoss
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first No");
        int n = sc.nextInt();
        System.out.println("Enter the second No");
        int a = sc.nextInt();
        int sum ;
        if(n>a){
            sum = n - a;
            System.out.println("Profit of "+sum);
        }
        else{
            sum = a - n;
            System.out.println("Loss of "+sum);
        }
        sc.close();
    }    
}
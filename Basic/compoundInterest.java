import java.util.Scanner;

public class compoundInterest {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount");
        float principal = sc.nextFloat();
        System.out.println("Enter the Interst Rate(in Percentage) ");
        float interstRate = sc.nextFloat();
        System.out.println("No of times Interst is compounded in an year(1 if once a year)");
        int n = sc.nextInt();
        System.out.println("No of years");
        int time = sc.nextInt();
        interstRate = interstRate/100;
        float check1 = (1+(interstRate/n));
        float power = 1;
        for(int i = 0;i<n*time;i++)
            {
                power = power*check1;
            }
            float Final = principal*power;
        float amount = Final - principal;
            System.out.println(amount +" is the Compound interest");
    }
}

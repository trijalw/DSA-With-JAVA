import java.util.Scanner;

public class reverseAFourDigitNo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a four Digit No");
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = n;
        while(n>0){
            a = n%10;
            b = b*10 + a;
            n = n/10;
        }
        if(c==b){
            System.out.println("Yes it is the reverse of the no");
        }
        else{
            System.out.println("No it is not the reverse of the no");
        }

        sc.close();
    }
}
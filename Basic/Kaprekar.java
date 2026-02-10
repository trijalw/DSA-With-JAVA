import java.util.Scanner;

public class Kaprekar {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int square = n*n;
        int digits = 0;
        int div = 1;
        int a = n;
        int count = 0;
        while(n>0){
            count ++;
            n=n/10;
        }
        while (digits<count) {
            div = div * 10;
            digits ++;
            
        }
        int right = square % div;
        int left = square / div;
        if(left+right == a) {
            System.out.println("It is a Kaprekar Number");
        }
        else 
        {
            System.out.println("No it is not a Kaprekar Number");
        }
    }
}
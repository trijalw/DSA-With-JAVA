
// kaprekar number code
// if like 9 square 81 8+1 = 9 so kaprekar no
import java.util.Scanner;
public class code2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n*n;
        int b ;
        int sum =0;
        while(a>0){
            b= a%10;
            sum = sum+b;
            a=a/10;
        }
        if(n == sum){
            System.out.println("Yes it a karprekar Number");
        }
        else{
            System.out.println("No it is not a karprekar Number");
        }
        sc.close();
    }
}
// Prime no
import java.util.Scanner;
public class code3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no");
        int a = sc.nextInt() ;
        System.out.println("Enter a no");
        int n= sc.nextInt();
        for(int i = a;i<=n;i++){
            if(i<2)continue;
            boolean isPrime = true;
   
        for(int j = 2 ;j*j<=i;j++){
            if(i%j==0){
                isPrime = false;
            }
        }
        if(isPrime == true ){
            System.out.println(i);
        }
        }
        sc.close();
    }

}

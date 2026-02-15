
// reverse no code 

import java.util.Scanner;
public class code {
    public static void main(String[] args) {
        int revno =0;
        int a ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int b = n;
        while (n>0){
            a = n%10;
            revno = revno*10 + a;
            n=n/10;
        }
        if(b==revno){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}


import java.util.Scanner;

public class formAFourDigitNo {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter The first digit of the no");
        // int n = sc.nextInt();
        // System.out.println("Enter The Second digit of the no");
        // int a = sc.nextInt();
        // System.out.println("Enter The Third digit of the no");
        // int b = sc.nextInt();
        // System.out.println("Enter The Fourth digit of the no");
        // int c = sc.nextInt();
        // sc.close();
        int sum = 0;
        int no = 0;
        for(int i = 0;i<4;i++){
            System.out.println("Enter the "+(i+1)+" Number");
            no = sc.nextInt();
            sum = sum*10 +no; 
        }
        System.out.println("The Number is "+sum);
        sc.close();
    }
}

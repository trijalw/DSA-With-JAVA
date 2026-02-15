import java.util.Scanner;

public class code1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Plz Enter the size of the array");
        int size = sc.nextInt();
        int []n = new int[size];
        for(int i = 0;i<size;i++){
            System.out.println("Plz Enter Array Element "+(i+1));
            n[i]=sc.nextInt();
        }
        for(int i =0;i<size;i++){
            System.out.println("The"+i +" Element is :"+n[i]);
        }

        sc.close();
    }
}
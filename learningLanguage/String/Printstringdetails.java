import java.util.Scanner;

public class Printstringdetails {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(a.length());
        System.out.println(a.charAt(0));
        System.out.println(a.charAt(a.length()-1));
        sc.close();
    }
}
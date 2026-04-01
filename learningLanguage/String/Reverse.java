import java.util.*;

public class Reverse {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println();
        for (int i = s.length()-1;i>=0;i--) {
            System.out.print(s.charAt(i));
        }
        sc.close();
    }
}
// char[] arr = s.toCharArray();
// for (int i = arr.length - 1; i >= 0; i--) {
//     System.out.print(arr[i]);
// } char array method
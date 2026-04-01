import java.util.*;
public class Countvowels {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println("");
        int count = 0;
        char[] vowels = {'a','A','e','E','o','O','u','U','i','I'};
        for (int i = 0;i<=a.length()-1;i++) {
            for (int j = 0;j<vowels.length;j++) {
            if (a.charAt(i) == vowels[j]) {
                count ++;
            }
        }
    }
        System.out.println(count);
        sc.close();      
    }
}

// best method
// a.toloweCase();
// in for loop use if condition (a.charAt =='a'|| so on)


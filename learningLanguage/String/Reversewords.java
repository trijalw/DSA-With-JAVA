import java.util.*;

public class Reversewords {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println();
        String [] words = a.split(" ");
        for (int i = words.length-1;i>=0;i--) {
            System.out.print(words[i]+" ");
        }

        sc.close();
    } 
}

// StringBuilder sb = new StringBuilder(s);
// System.out.println(sb.reverse());

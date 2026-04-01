import java.util.Scanner;

public class Countcharacters {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        a = a.trim();
        int count = 0;
        for (int i = 0;i<=a.length()-1;i++) {
            if (a.charAt(i)== ' ') {
                count ++;
            }
        }
        System.out.println(a.length()-count);

        sc.close();
    }
}

// if (!Character.isWhitespace(a.charAt(i))) best loop method
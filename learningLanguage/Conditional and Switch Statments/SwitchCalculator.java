public class SwitchCalculator {
    public static void main (String [] args) {

        int n = 1;
        int a = 2;
        int sum ;
        char ch = '+';
        switch (ch) {
            case ('+') : 
                sum = n + a;
                System.out.println(sum);
                break;
            
            case ('-') : 
                sum = n - a;
                System.out.println(sum); 
        }
    }
}

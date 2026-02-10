public class palindromNo {
    public static void main (String[] args) {
        int n = 2552;
        int a = n;
        int revno = 0;
        int random = 0;
        while(n>0){
            random = n%10;
            revno = revno*10 + random;
            n=n/10;
        }
        if (a == revno) {
            System.out.println("It is a Palindrome No");
        }
        else {
            System.out.println("It is not a Palindrom");
        }   
    }
}

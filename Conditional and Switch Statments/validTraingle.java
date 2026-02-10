public class validTraingle {
    public static void main (String[] args) {
        int a = 10;
        int b = 10;
        int c = 10;
        if (a+b>c && a+c>b && b+c>a) 
        {
            System.out.println("It is a valid Traingle");
        }
        else{
            System.out.println("It is not a valid Triangle");
        }
    }
}

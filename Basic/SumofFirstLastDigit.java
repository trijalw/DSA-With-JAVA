public class SumofFirstLastDigit{
    public static void main(String[]args){
        int n = 10001;
        int d = n;
        int c = n;
        int a = d%10;
        int b = 0;
        while(c>0){
            b=c%10;
            c=c/10;
        }
        int sum = a + b;
        System.out.println(sum);

    }
}
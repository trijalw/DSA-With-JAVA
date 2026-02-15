import java.util.Scanner;

public class rotateAArraybyk {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int shift = sc.nextInt();
        int size = sc.nextInt();
        int [] n = new int[size];
        for (int i = 0;i<n.length;i++)
        {
            n[i] = sc.nextInt();
        }
            shift =  shift % size ;
            int a = shift;
            int [] temp = new int[size];
            int index = 0;
            for(int i = n.length-1;i>=0;i--)
            {
                temp[index++] = n[i]; 
                a--;
                if(a<=0)
                {
                    break;
                }
            }
            for (int i = 0;i<size - shift;i++)
            {
                temp[index ++] = n[i]; 
            }
            for (int i = 0;i<size ;i++)
            {
                n[i] = temp[i];
            }
            for (int i = 0;i<size;i++){
                System.out.println(n[i]);
            }
        
    }
}

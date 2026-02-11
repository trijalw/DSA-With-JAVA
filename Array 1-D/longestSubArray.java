import java.util.Scanner;

public class longestSubArray {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] n = new int[size];
        int length = 1;
        int count = 0;
        for (int i = 0;i<size;i++)
        {
            System.out.println("Enter the  "+(i+1)+ " Element");
            n[i] = sc.nextInt();
        }
        int endindex ;
        int tempStart=0;
        int maxLength = 1;
        int startIndex = 0;
        for (int i=0;i<size-1;i++)
        {
                if (n[i]<n[i+1])
                {
                    length++;
                    if (length>maxLength){
                    maxLength = length;
                    startIndex = tempStart;
                    }
                }
                else{
                    length = 1;
                    tempStart = i+1;
                }
        }
        endindex = startIndex + maxLength -1;
        System.out.print(maxLength + " "+ (startIndex+1) + " "+(endindex+1));
        

        sc.close();
    }

    }


import java.util.*;
class cash{
    int itemPrice;
    int itemQuantity;
    int twoThousand;
    int fiveHundred;
    int hundred;
    int fifty;
    int ten;
    void getCash(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter item price");
        itemPrice = sc.nextInt();
        System.out.println("Enter item quantity");
        itemQuantity = sc.nextInt();
        System.out.println("Enter given notes of two thousand");
        twoThousand = sc.nextInt();
        System.out.println("Enter the notes of five Hundred");
        fiveHundred = sc.nextInt();
        System.out.println("Enter the notes of hundred");
        hundred = sc.nextInt();
        System.out.println("Enter the notes of fifty");
        fifty = sc.nextInt();
        System.out.println("Enter the notes of ten ");
        ten = sc.nextInt();

    }
    void display(){
        int bill = itemPrice * itemQuantity;
        int totalCash = (twoThousand*2000)+(fiveHundred*500)+(hundred*100)+(fifty*50)+(ten*10);
        if (totalCash>bill || bill== totalCash)
        {
            System.out.println("Clear");
        }
        else {
            int diff = bill-totalCash;
        }
    }
}

class Bill{
    public static void main(String[] args) 
        {
            cash total = new cash();
            total.getCash();
            total.display();
        }
    
}
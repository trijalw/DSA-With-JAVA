import java.util.Scanner;


public class noToYearsFormat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int year = 0;
        int months = 0;
        while(n>=31){
            if(n>=31){
                months ++;
                n = n-31;
            }
        }
        while(months>=12){
            if(months>=12){
                year++;
                months = months - 12;
            }
        }
        System.out.println("The Number of Years is "+year+" The no of months is "+ months+" The no of days is "+n);
    }
}

// The Proper way 

// public class DaysToYearsMonthsManual {
//     public static void main(String[] args) {
//         int days = 800;

//         int year = 0, month = 0;
//         int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};

//         while (days >= 365) {
//             days -= 365;
//             year++;
//         }

//         for (int i = 0; i < 12; i++) {
//             if (days >= monthDays[i]) {
//                 days -= monthDays[i];
//                 month++;
//             } else {
//                 break;
//             }
//         }

//         System.out.println("Years: " + year);
//         System.out.println("Months: " + month);
//         System.out.println("Days: " + days);
//     }
// }

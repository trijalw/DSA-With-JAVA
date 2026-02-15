import java.util.Scanner;

class carInfo {
    protected String vehicleNo;
    protected String vehicleName;

    public carInfo() {
        
    }
    
    public carInfo (String a,String b)
    {
        vehicleNo = a;
        vehicleName = b;
    }
    public void drive()
    {
        System.out.println("The car is in Working condition"+ " The car number is "+ vehicleNo+" and the Vehicle Name is "+vehicleName);
    }
};

public class basic {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        carInfo myCar = new carInfo();
        System.out.println("Enter the Vehicle No");
        myCar.vehicleNo = sc.next();
        System.out.println("Enter the Vehicle Name");
        myCar.vehicleName = sc.next();
        myCar.drive();
    }
}
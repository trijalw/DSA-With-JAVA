import java.util.Scanner;
class helicopter {
    protected String heliId;
    protected String driverName;
    public helicopter(Scanner sc)
    {
        System.out.print("Enter Helicopter Id :");
        heliId = sc.next();
        System.out.print("Enter Driver Name");
        driverName = sc.next();
    }
    public void heli()
    {
        System.out.println("The class is working properly "+heliId+" "+driverName);
    }
}

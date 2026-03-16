import java.util.*;
interface driveable{
    final int Max_Speed_limit = 200;
    void startEngine();
    void accerelate(int speedIncrease);
}
abstract class Vehicle{
    final String chassisNumber;
    int currentSpeed;

    public Vehicle(String chassisNumber,int currentSpeed) {
        this.chassisNumber=chassisNumber;
        this.currentSpeed = currentSpeed;

    }
    public final String getChassisNumber(){
        return chassisNumber;
    }
    public int getCurrentSpeed(){
        return currentSpeed;
    }
    public void setCurrentSpeed(int speed){
        this.currentSpeed = speed;
    }
    abstract void brake();
    abstract void displayInfo();
    


}
final class Concrete extends Vehicle implements driveable{
    String modelName;
    

    

    public Concrete(String chassisNumber,String modelName,int currentSpeed) {
        super(chassisNumber,currentSpeed);
        this.modelName = modelName;

    }
    @Override
    public void startEngine(){
        System.out.println("Start the engine");
    }
    @Override
    public void accerelate(int speedIncrease){
        if (this.currentSpeed + speedIncrease >=Max_Speed_limit){}
        else{
        this.currentSpeed = speedIncrease;
        System.out.println("Car accerelating New Speed: "+currentSpeed+" km/h");
        }
    }
    @Override
    void brake(){
        this.currentSpeed = 0;
        System.out.println("Car Breaking now Speed is "+currentSpeed+"1 km/h");
    }
    @Override
    void displayInfo(){
        System.out.println(chassisNumber);
        System.out.println(currentSpeed);
        System.out.println(modelName);
    }
    public void horn(){
        System.out.println("Beep Beep ...");
    }
    }



public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String chass = sc.nextLine();
        String modelName= sc.nextLine();
        int currentSpeed = sc.nextInt();
        
        Concrete v = new Concrete(chass,modelName,currentSpeed);
        v.displayInfo();
        v.startEngine();
        v.accerelate(50);
        v.displayInfo();
        v.brake();
        System.out.println("Final Chass is Number is : "+v.getChassisNumber());
    }
}

class F1 { // only one public class allowed in java
    static {
        System.out.println("This is a static block");
    }
}
public class F2{
    public static void main(String[] args)
        {
            F1 f = new F1();
        }
    }


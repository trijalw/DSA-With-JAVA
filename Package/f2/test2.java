package f2;
import F1.*;

public class test2 extends test {
    public static void main (String[] args)
    {
        test2 var1 = new test2();
        // var1.show_default();
        // var1.show_private();  // shows error so the table is correct
        var1.show_protected();
        var1.show_public();
    }
}
package F1;

public class test{
    
    public void show_public()
    {
        System.out.println("Method is public");
    }
    protected void show_protected()
    {
        System.out.println("Method is protected");
    }

    void show_default()
    {
        System.out.println("Method is default");
    }

    private void show_private()
    {
        System.out.println("Method is private");
    }

    public static void main(String[]args)
    {
        test t = new test();
        t.show_public();
        t.show_protected();
        t.show_default();
        t.show_private();
    }
}
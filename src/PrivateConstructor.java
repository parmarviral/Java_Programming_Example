public class PrivateConstructor {

    static int c=0;
    private PrivateConstructor()
    {
        c++;
    }
    private PrivateConstructor(int x)
    {
        System.out.println("I am overloaded private constructor. " +x);
    }

    void count()
    {
        System.out.println("I am default  private constructor. "+  c );
    }
    public static void main(String args[])
    {
        PrivateConstructor t1 = new PrivateConstructor();
        PrivateConstructor t3 = new PrivateConstructor();
        PrivateConstructor t2 = new PrivateConstructor(10);
        PrivateConstructor t4 = new PrivateConstructor();
        t1.count();
    }
}

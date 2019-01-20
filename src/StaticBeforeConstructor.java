class Test1 {
    static int i;
    int j;
    static {
        i = 10;
        System.out.println("static block called ");
    }
    Test1(){
        System.out.println("Constructor called");
    }
}

public class StaticBeforeConstructor {
    public static void main(String args[]) {
        // Although we have two objects, static block is executed only once.
        Test1 t1 = new Test1();
        Test1 t2 = new Test1();
    }
}

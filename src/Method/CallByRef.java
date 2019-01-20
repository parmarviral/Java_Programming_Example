package Method;

// Objects are passed by reference.
class test5 {
    int a, b;
    test5(int i, int j) {
        a = i;
        b = j;
    }
    // pass an object
    void meth(test5 o) {
        o.a *= 2;
        o.b /= 2;
    }
}
class CallByRef {
    public static void main(String args[]) {
        test5 ob = new test5(15, 20);
        System.out.println("ob.a and ob.b before call: " +
                ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a and ob.b after call: " +

                ob.a + " " + ob.b);
    }
}

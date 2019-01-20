package Method;

// Objects may be passed to methods.
class tesst {
    int a, b;
    tesst(int i, int j) {
        a = i;
        b = j;
    }
    // return true if o is equal to the invoking object
    boolean equals(tesst o) {
        if(o.a == a && o.b == b) return true;
        else return false;
    }
}
class PassOb {


    public static void main(String args[]) {
        tesst ob1 = new tesst(100, 22);
        tesst ob2 = new tesst(100, 22);
        tesst ob3 = new tesst(-1, -1);
        System.out.println("ob1 == ob2: " + ob1.equals(ob2));
        System.out.println("ob1 == ob3: " + ob1.equals(ob3));
    }
}

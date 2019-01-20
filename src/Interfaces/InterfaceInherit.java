package Interfaces;

interface p1 {
    int i=1;
    void meth1();

}

interface p2 {
    int j=2;
    void meth2();

}

interface p12 extends p1,p2 {
    void meth3();
}

class Q implements p12 {
    public void meth1() {
        System.out.println("Implement meth1()." + i);
    }
    public void meth2() {
        System.out.println("Implement meth2()." + j);
    }
    public void meth3() {
        System.out.println("Implement meth3().");
    }
}
class InterfaceInherit {
    public static void main(String arg[]) {
        Q ob = new Q();
        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}

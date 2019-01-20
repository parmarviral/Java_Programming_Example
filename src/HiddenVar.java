class AAA {
    int x;
}
class B extends AAA {
    int x; B(int a, int b) {
        super.x = a;
        x = b;
    }
    void show() {
        System.out.println("x in superclass: " + super.x);
        System.out.println("x in subclass: " + x);
    }
}
class HiddenVar {
    public static void main(String args[]) {
        B subOb = new B(1, 2);
        subOb.show();
    }
}

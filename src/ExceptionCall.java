class MyException extends Exception {
    private int detail;
    MyException(int a) {
        detail = a;
    }
    public String toString() {
        return "Division by zero ";
    }
}
class ExceptionClass {
    static void compute(int a) throws MyException {
        if(a == 0)
            throw new MyException(a);
        int b = 40/a;
        System.out.println(b);
    }
    public static void main(String args[]) {
        try {
            int l= args.length;
            compute(l);
        } catch (MyException e) {
            System.out.println("Caught: " + e);
        }
    }
}

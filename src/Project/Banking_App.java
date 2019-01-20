package Project;

class MyException extends Exception {
    private int detail;

    MyException(int a) {
        detail = a;
    }

    public String toString() {
        return "Not sufficient fund";
    }
}

class Banking_App {
    static int t = 1000;

    static void compute(int a) throws MyException {
//System.out.println("Called compute(" + a + ")");
        t = t - a;
        if (t < 0)
            throw new MyException(a);
        System.out.println("remaining balance is:" + t);
    }

    public static void main(String args[]) {
        try {
            compute(400);
            compute(300);
            compute(500);
        } catch (MyException e) {
            System.out.println("Caught :" + e);
        }
    }
}

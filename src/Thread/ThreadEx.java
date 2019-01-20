package Thread;

class A extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("thread 1");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
    }
}

class B extends Thread {
    public void run() {
        try {
            for (int j = 0; j < 10; j++) {
                System.out.println("thread 2");
                Thread.sleep(4000);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
    }
}

class ThreadEx {
    public static void main(String args[]) {
        new A().start();
        new B().start();
    }
}


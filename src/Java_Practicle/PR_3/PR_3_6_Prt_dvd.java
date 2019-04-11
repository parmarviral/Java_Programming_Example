
public class PR_3_6_Prt_dvd {
    public static void main(String args[]) {
        System.out.println("1 to 100");
        int i = 0;
        for (i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " is divided by 3 ");
            }
            if (i % 5 == 0) {
                System.out.println(i + " is divided by 5 ");
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " is divided by 3&5");
            }
        }
    }

}

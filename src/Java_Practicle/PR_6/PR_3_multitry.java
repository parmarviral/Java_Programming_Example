import java.util.Scanner;

public class PR_6_3_multitry {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter division number");
        String h = s.nextLine();

        System.out.println("enter division number");
        int b = s.nextInt();

        int a[] = {2, 5, 7, 1, 9};

        try {
            try {

                System.out.println(a[4] / b);
                int num = Integer.parseInt("" + h);

                System.out.println(num);
            } catch (ArithmeticException e) {
                System.out.println("arithmetic error" + e);
            } catch (NumberFormatException e) {
                System.out.println("Number format exception" + e);
            }


        } catch (Exception e) {
            System.out.println("aa");
        }

    }
}

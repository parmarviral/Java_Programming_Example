import java.util.Scanner;

public class PR_3_5_evenodd {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number you want");
        int i = s.nextInt();

        if (i % 2 == 0) {
            System.out.println(" 1");
        } else {
            System.out.println(" 0");
        }
    }
}

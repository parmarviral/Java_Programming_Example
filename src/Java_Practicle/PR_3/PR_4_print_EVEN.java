package Java_Practicle.PR_3;

import java.util.Scanner;

public class PR_4_print_EVEN {
    public static void main(String args[]) {
        Scanner SCNR = new Scanner(System.in);
        System.out.println("Enter a Number Till Print The Even Number: ");
//        int num = SCNR.nextInt();
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + "\n");
            }
        }
    }
}

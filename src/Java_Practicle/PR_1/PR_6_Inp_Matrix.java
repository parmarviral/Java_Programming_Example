package Java_Practicle;

import java.util.Scanner;

public class PR_6_Inp_Matrix {
    public static void main(String[] arg) {
        System.out.println("Enter a Number to Perform a Multiphication Table: ");
        Scanner Scan_obj = new Scanner(System.in);
        int Number = Scan_obj.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(Number + "*" + Number + " = " + (Number * i));
        }
    }
}
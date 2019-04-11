package Java_Practicle;

import java.util.Scanner;

public class PR_5_All {
    public static void main(String[] arg) {
        Scanner Scan_Obj = new Scanner(System.in);
        System.out.println("Enter a First Number: ");
        int NUM = Scan_Obj.nextInt();
        System.out.println("Enter a Second Number : ");
        int NUM2 = Scan_Obj.nextInt();
        System.out.println("Product of The Number " + NUM + " and " + NUM2 + " is " + NUM * NUM2);
        System.out.println("Addition of The Number " + NUM + " and " + NUM2 + " is " + (NUM + NUM2));
        System.out.println("Substraction of The Number " + NUM + " and " + NUM2 + " is " + (NUM - NUM2));
        System.out.println("Devision of The Number " + NUM + " and " + NUM2 + " is " + (NUM / NUM2));
        System.out.println("Reminder of The Number " + NUM + " and " + NUM2 + " is " + (NUM % NUM2));
    }
}

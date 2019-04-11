package Java_Practicle;

import java.util.Scanner;

public class PR_4_Scan_input_Display {
    public static void main(String[] arg) {
        Scanner Scan_Obj = new Scanner(System.in);
        System.out.println("Enter a First Number: ");
        int NUM = Scan_Obj.nextInt();
        System.out.println("Enter a Second Number for Product : ");
        int NUM2 = Scan_Obj.nextInt();
        System.out.println(NUM * NUM2);
    }
}
package Java_Practicle.PR_3;

import java.util.Scanner;

public class PR_2_ASCII_Print {
    public static void main(String[] args) {
        Scanner SCN_O = new Scanner(System.in);
        System.out.println("Enter a one Charecter");
        char ch = SCN_O.next().charAt(0);
        int asciiCode = ch;
        // type casting char as int
        int asciiValue = (int)ch;
        System.out.println("ASCII Code of "+ch+" is: " + asciiCode);
        System.out.println("ASCII value of "+ch+" is: " + asciiValue);
    }
}

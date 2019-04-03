package Java_Practicle.PR_2;
import java.util.Scanner;

public class PR_5_Reverse_String {
    public static void main(String[] arg){
        System.out.println("Enter string to reverse:");
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Reversed string is:");
        System.out.println(reverse);
    }
}
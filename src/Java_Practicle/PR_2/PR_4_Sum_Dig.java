package Java_Practicle.PR_2;

import java.util.Scanner;

public class PR_4_Sum_Dig {
   static int getSum(int n)
        {
            int sum = 0;
            while (n != 0)
            {
                sum = sum + n % 10;
                n = n/10;
            }
            return sum;
        }
        public static void main(String[] args)
        {
            Scanner SCaN = new Scanner(System.in);
            System.out.println("Enter a Value!!");
            int n = SCaN.nextInt();
            System.out.println(getSum(n));
        }
    }
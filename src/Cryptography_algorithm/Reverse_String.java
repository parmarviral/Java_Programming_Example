package Cryptography_algorithm;

import java.lang.*;
import java.io.*;
import java.util.*;

public class Reverse_String
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse: ");
        String input =sc.next();
        char[] try1 = input.toCharArray();
        for (int i = try1.length-1; i>=0; i--)
            System.out.print(try1[i]);
        System.out.println("\n");
    }
}
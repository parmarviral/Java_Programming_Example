import java.util.Scanner;

public class Fibonacci_Iterative {
    public static void main(String args[])
    {
        System.out.println("Enter the Limit: ");
        Scanner s=new Scanner(System.in);
        int l=s.nextInt();
        fib(l);
    }

    public static void fib(int limit)
    {
        int a=0,b=1,sum;
        for(int i=0;i<limit;i++)
        {
            System.out.println(a);
            sum=a+b;
            b=a;
            a=sum;
        }
    }
}

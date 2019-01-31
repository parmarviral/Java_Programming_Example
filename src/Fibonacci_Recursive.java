import java.util.Scanner;

public class Fibonacci_Recursive {
    private static int a=0,b=1,sum;

    public static void main(String args[])
    {
        System.out.println("Enter the Limit: ");
        Scanner s=new Scanner(System.in);
        int l=s.nextInt();
        fib(l);
    }

    public static int fib(int limit)
    {
        System.out.println(a);

        sum=a+b;
        b=a;
        a=sum;

        if(limit>1)
        {
            limit--;
            fib(limit);
        }
        return 0;
    }
}

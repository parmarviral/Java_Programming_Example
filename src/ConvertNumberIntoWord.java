import java.util.Scanner;
class ConvertNumberIntoWord
{
    public static void main(String args[])
    {
        int n, reverse = 0,d;
        System.out.println("Enter the number:");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        while( n != 0 )
        {
            reverse = reverse * 10;
            reverse = reverse + n%10;
            n = n/10;
        }
        while( reverse != 0 )
        {
            d = reverse % 10;
            switch (d)
            {
                case 1: System.out.print("One ");break;
                case 2: System.out.print("Two "); break;
                case 3: System.out.print("Three "); break;
                case 4: System.out.print("Four "); break;
                case 5: System.out.print("Five "); break;
                case 6: System.out.print("Six "); break;
                case 7: System.out.print("Seven "); break;
                case 8: System.out.print("Eight "); break;
                case 9: System.out.print("Nine "); break;
                case 0: System.out.print("Zero "); break;
                default: System.out.print(""); break;
            }
            reverse = reverse/10;
        }
    }
}
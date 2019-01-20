import java.util.Scanner;
class A
{
    void check(int year)
    {
        boolean isLeapYear = false;
        if(year % 400 == 0)
        {
            isLeapYear = true;
        }
        else if (year % 100 == 0)
        {
            isLeapYear = false;
        }
        else if(year % 4 == 0)
        {
            isLeapYear = true;
        }
        else
        {
            isLeapYear = false;
        }

        //Output the test result
        if(isLeapYear)
        {
            System.out.println("Year "+year+" is a Leap Year");
        }
        else
        {
            System.out.println("Year "+year+" is not a Leap Year");
        }
    }
}

public class CheckYearisLeap extends A
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year : ");

        int Year = scanner.nextInt();

        CheckYearisLeap ob = new CheckYearisLeap();
        ob.check(Year);
    }
}

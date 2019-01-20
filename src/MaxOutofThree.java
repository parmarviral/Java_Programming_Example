import java.io.*;
class MaxOutofThree //create class
{
    public static void main(String args[]) throws IOException
    {
        int num1,num2,num3,big_num;
        System.out.println("Enter first number"); //get three number one by one
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        num1=Integer.parseInt(br.readLine());
        System.out.println("Enter second number");
        num2=Integer.parseInt(br.readLine());
        System.out.println("Enter third number");
        num3=Integer.parseInt(br.readLine());
        big_num = (num1 > num2) ?( (num1>num3) ? num1:num3):(num2>num3?num2:num3); //using Turnary operator we compare the variable
        System.out.println("The Biggest Number is: "+big_num); //Print Output on screen
    }
}

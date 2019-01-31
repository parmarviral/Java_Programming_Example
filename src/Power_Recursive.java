import java.util.*;

public class Power_Recursive {
    private static int answer=1;
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int base,power;
        System.out.println("Enter The Base:");
        base=s.nextInt();
        System.out.println("Enter The Power:");
        power=s.nextInt();
        System.out.println("Answer: "+calcPower(base,power));
    }

    public static int calcPower(int b,int p)
    {
        answer=answer*b;
        if(p>1)
        {
            p--;
            calcPower(b,p);
        }
        return answer;
    }
}

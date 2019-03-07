import java.util.*;

public class StringLength_Recursion {
    private static int len=0;
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String");
        String str=s.next();
        System.out.println("Length of String: "+strLen(str));
    }

    public static int strLen(String str)
    {
        char[] c_str=str.toCharArray();
        if(c_str[len]!=' ')
        {
            len++;
            strLen(str);
        }
        return len;
    }
}

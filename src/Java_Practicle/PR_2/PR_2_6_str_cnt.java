import java.util.Scanner;

public class PR_2_6_str_cnt {
    public static void main(String args[]) {
        String cnt;
        System.out.println("enter string");
        //"prince @ rsu on 7th april 2019";
        Scanner s = new Scanner(System.in);
        cnt = s.nextLine();
        count(cnt);

    }

    public static void count(String x) {

        char[] ch = x.toCharArray();
        int letter = 0, space = 0, num = 0, other = 0;
        for (int i = 0; i < x.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                num++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            } else {
                other++;
            }
        }
        System.out.println(x);
        System.out.println(letter);
        System.out.println(num);
        System.out.println(space);
        System.out.println(other);
    }

}

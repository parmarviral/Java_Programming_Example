package Java_Practicle.PR_6;

public class PR_1_Except {
    public static void main(String[] arg){
        try {
            System.out.println(10/0);
        }
        catch (Exception e){
            System.out.print(e);
        }
    }
}

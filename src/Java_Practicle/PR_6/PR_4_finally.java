package Java_Practicle.PR_6;

public class PR_4_finally {
    public static void main(String[] arg){
        try{
            System.out.println("Is Exception There??");
//            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println(e);
            System.out.println("There Where no Exception");
        }
        finally {
            System.out.println("Im Finally Executed!! :D");
        }
    }
}

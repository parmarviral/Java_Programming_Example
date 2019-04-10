package Java_Practicle.PR_6;

import java.util.concurrent.ExecutionException;

public class PR_2_Thrw {
    static void exp() throws Exception {
        fun();
        throw new Exception("Im a Exp's Exception");
    }
    static void fun() throws Exception {
        throw new Exception("Im a Fun's Exception");
    }
    public static void main(String[] arg){
        try{
            exp();
        }catch (Exception e){
            System.out.println("Error in exp()");
        }
    }
}

package Java_Practicle.PR_4;

class PR_4_1_str_from {
    public static void main(String[] args) {
        String str1 = "Python";
        String str2 = "Tutorial";

        if (str1.length() >= str2.length())
            System.out.println(str2 + str1 + str2);
        else
            System.out.println(str1 + str2 + str1);
    }
}

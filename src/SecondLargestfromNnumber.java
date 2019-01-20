import java.util.Scanner;

class SecondLargestfromNnumber{
    public static void main(String argn[]){
        Scanner data = new Scanner(System.in);
        int num, i, temp, max, max_2, a;
// Reading numbers want to be read
        System.out.print("Enter number you want to enter:");
        num = data.nextInt();
        System.out.println("Enter " +num+ " number");
// Reading 1st number
        max = data.nextInt();
        a = data.nextInt();
        if(max < a)
        {
            max_2=max;
            max=a;
        }
        else
            max_2=a;
// Reading other number
        for (i=2; i < num; i++) { temp = data.nextInt();
            if(temp < max)
            {
                if(temp > max_2)
                {
                    max_2=temp;
                    continue;
                }
            }
            else
// largest number
            {
                if (temp >max_2)
                {  max_2=max;
                    max = temp;
                }
            }
        }
        System.out.println("Second Largest Number is "+max_2); //OP on screen
    }
}

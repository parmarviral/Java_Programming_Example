package Inheritance;
class AA
{
    void DisplayA()
    {
        System.out.println("I am in A");
    }
}

class BB extends AA
{
    void DisplayB()
    {
        System.out.println("I am in B");
    }
}
class CC extends AA
{
    void DisplayC()
    {
        System.out.println("I am in C");
    }
}

public class HiararchicalInherit
{
    public static void main(String args[])
    {
        System.out.println("Calling for subclass C");
        CC c = new CC();
        c.DisplayA();
        c.DisplayC();

        System.out.println("Calling for subclass B");
        BB b = new BB();
        b.DisplayA();
        b.DisplayB();
    }
}

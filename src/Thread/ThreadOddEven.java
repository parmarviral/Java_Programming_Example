package Thread;
class Aoo extends Thread
{
    public void run()
    {
        try {
            for(int i=1;i<=50;i+=2)
            {
                System.out.println ( "thread 1 : " + i);
                Thread.sleep(2000);
            }}
        catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }

    }
}

class Boo extends Thread
{
    public void run()
    {try {
        for(int j=2;j<=50;j+=2)
        {
            System.out.println ( "thread 2 : "+ j );
            Thread.sleep(4000);
        }}catch (InterruptedException e) {
        System.out.println("Child interrupted.");
    }   }}

class ThreadOddEven{
    public static void main(String args[])
    {
        new Aoo().start();
        new Boo().start();
    }}


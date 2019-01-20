import java.lang.Math;

abstract class Shape1
{
    abstract void area();
    double area;
}

class Triangle extends Shape1
{
    double b=50,h=15;
    void area()
    {
        area = (b*h)/2;
        System.out.println("area of Triangle -->"+area);
    }
}

class Rectangle1 extends Shape1
{
    double w=70,h=20;
    void area()
    {
        area = w*h;
        System.out.println("area of Rectangle -->"+area);
    }
}

class Circle1 extends Shape1
{
    double r=5;
    void area()
    {
        area = Math.PI * r * r;
        System.out.println("area of Circle -->"+area);
    }
}

class AbatractClass
{
    public static void main(String [] args)
    {
        Triangle t= new Triangle();
        Rectangle1 r =new Rectangle1();
        Circle1 c =new Circle1();

        t.area();
        r.area();
        c.area();
    }
}

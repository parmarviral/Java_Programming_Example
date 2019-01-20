abstract class Shp
{
    public static float pi = 3.142f;
    protected float height;
    protected float width;

    abstract float areea() ;
}
class Square extends Shp
{
    Square(float h, float w)
    {
        height = h;
        width = w;
    }

    final float areea() // This method cannot be overridden in it's sub classes
    {
        return height * width;
    }
}

class Rect extends Shp
{
    Rect(float h, float w)
    {
        height = h;
        width = w;
    }

    final float areea()  // This method cannot be overridden in it's sub classes
    {
        return height * width;
    }
}

class Gol extends Shp
{
    float radius;

    Gol(float r)
    {
        radius = r;
    }

    final float areea()  // This method cannot be overridden in it's sub classes
    {
        return Shp.pi * radius *radius;
    }
}

class FinalMethod
{
    public static void main(String args[])
    {
        Square sObj = new Square(5,5);
        Rect rObj = new Rect(5,7);
        Gol cObj = new Gol(2);

        System.out.println("Area of square : " + sObj.areea());
        System.out.println("Area of rectangle : " + rObj.areea());
        System.out.println("Area of circle : " + cObj.areea());
    }
}

class Point
{
    int x, y;
}

class ColoredPoint extends Point
{
    int color;
}

// Colored3dPoint class cannot be extended further

final class Colored3dPoint extends ColoredPoint
{
    int z;
}

class FinalClass
{
    public static void main(String args[])
    {
        Colored3dPoint cObj = new Colored3dPoint();

        cObj.z = 10;
        cObj.color = 1;
        cObj.x = 5;
        cObj.y = 8;

        System.out.println("x = " + cObj.x);
        System.out.println("y = " + cObj.y);
        System.out.println("z = " + cObj.z);
        System.out.println("Color = " + cObj.color);
    }
}

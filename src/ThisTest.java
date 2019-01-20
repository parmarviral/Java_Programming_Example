class Rectangle{
    private int length;
    private int breadth;

    Rectangle(int length){
        this.length = length;
    }

    Rectangle(int length, int breadth){
        this(length);
        this.breadth = breadth;
    }
    public int area(){
        return (length*breadth);
    }
}

public class ThisTest {
    public static void main(String [] args){
        Rectangle rect = new Rectangle(5,5);

        System.out.println("The Area of rectangle is : "+
                + rect.area());

    }

}

public class IntegerToNumericPrimitiveTypesExample {
    public static void main(String[] args) {
        Integer intObj = new Integer("10");
        //use byteValue method of Integer class to convert it into byte type.
        byte b = intObj.byteValue();
        System.out.println(b);

        //use shortValue method of Integer class to convert it into short type.
        short s = intObj.shortValue();
        System.out.println(s);

        //use intValue method of Integer class to convert it into int type.
        int i = intObj.intValue();
        System.out.println(i);

        //use floatValue method of Integer class to convert it into float type.
        float f = intObj.floatValue();
        System.out.println(f);

        //use doubleValue method of Integer class to convert it into double type.
        double d = intObj.doubleValue();
        System.out.println(d);
    }
}

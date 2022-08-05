package Assisted_Practice1;



/**
 * TypeCasting 
 * implicit -> smaller data type to the larger type size.
 * explicit -> larger data type   to the smaller data type
 */
//Writing a program in Java to implement implicit and explicit type casting
public class TypeCasting {

    public static void main(String[] args) {
        float f = 6.7f;
        long l = (long) f;  //impicit typecasting
        System.out.println("Float -> Long : " + l);
        double d = 589.985;
        long ld =(long) d;
        System.out.println("Double -> long : "+ ld);
        int i = (int)ld;      // explicit
        System.out.println("long -> int : "+i);
        char c = (char) i;
        System.out.println("Int -> char : "  + c);

        double db = i;
        System.out.println("int -> double: "+db);
        long lng = (long)db;
        System.out.println("double -> long : "+lng);
    }
}
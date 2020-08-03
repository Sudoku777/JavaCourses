package Lesson_2_String_Operations;

/**
 * toString
 * toBinaryString
 * toHexString
 * toOctalString
 * parseInt
 */
public class String_Conversion_Operations {
    public static void main(String[] args) {
   int num1 = 100;
        System.out.println(Integer.toString(num1));
        System.out.println(Integer.toBinaryString(num1));
        System.out.println(Integer.toHexString(num1));
        System.out.println(Integer.toOctalString(num1));

        String str1 = "100";
        String str2 = "1010101";
        String str3 = "64";
        String str4 ="144";

        System.out.println(Integer.parseInt(str1));
        System.out.println(Integer.parseInt(str2,2));
        System.out.println(Integer.parseInt(str3,16));
        System.out.println(Integer.parseInt(str4,8));
    }
}
package Lesson_2_String_Operations;

/**
 * Replace - Normal
 * ReplaceAll - RegEx
 */
public class String_Replace_Operation {
    public static void main(String[] args) {
        String str1= "CONCENTRAT1234ON 1234MPROVES W1234TH PRACT1234CE";
        String str2 = "1234";
        String str3 = "I";

        System.out.println(str1.replace(str2,str3));

        String str4="EI#43843HHJDNVKDS98989 4347938 84938402&*^ $gh";
        String  patt="[^A-Za-z0-9\\s]";

        System.out.println(str4.replaceAll(patt,""));
    }
}

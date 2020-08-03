package Lesson_2_String_Operations;
/**
 * Contains
 * Statrts with
 * Ends with
 * Index of
 * Last Index of
 */
public class String_Search_Operation {
    public static void main(String[] args) {
     String str1 = "I love java and Selenium";
     String str2= "Java";
        System.out.println(str1.toLowerCase().contains(str2.toLowerCase()));
        System.out.println(str1.startsWith("I"));
        System.out.println(str1.endsWith("Selenium1"));
        System.out.println(str1.indexOf("love"));
        System.out.println(str1.indexOf("love",6));
        System.out.println(str1.lastIndexOf("love"));
    }
}

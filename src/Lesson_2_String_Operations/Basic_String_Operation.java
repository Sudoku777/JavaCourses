package Lesson_2_String_Operations;
/*
Concatenate
Length
Upper Case
Lower Case
Empty
 */
public class Basic_String_Operation {
    public static void main(String[] args) {
        String str1="De Zinnia";
        String srt2=" Institutes";

        String str3 =str1 + srt2;
        System.out.println(str3);

        String str4=str1.concat(srt2);
        System.out.println(str4);

        int num1=100;
        //  System.out.println(str1 + num1);
        System.out.println(str1.length());
        String str5 ="  ccscdsds fasfsfsfasf afafaaf";
        System.out.println(str5.trim());
        System.out.println(str5.toUpperCase());
        System.out.println(str5.toLowerCase());
        System.out.println(str5.isEmpty());
        String str6="";
        System.out.println(str6.isEmpty());
    }
}

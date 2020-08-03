package Lesson_2_String_Operations;

/**
 * Char at
 * Substring
 * Split
 */
public class String_Slice_Operation {
    public static void main(String[] args) {
        String str1="ABCDEFG";
        System.out.println(str1.charAt(3));

        //Write a program to reverse a string
        //
        String temp="";
        for(int i = 0;i<=str1.length()-1;i++){
            temp = str1.charAt(i)+temp;
        }
        System.out.println(temp);
        System.out.println(str1.substring(2));
        System.out.println(str1.substring(2,4));
        String str2 = "A_B_C_D";
        String str3 = "_";
        String[] arr = str2.split(str3);
        for(String x:arr){
            System.out.println(x);
        }
    }
}

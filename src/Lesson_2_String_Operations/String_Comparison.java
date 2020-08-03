package Lesson_2_String_Operations;

/**
 * Equals
 * Compare To
 * Matches
 */
public class String_Comparison {
    public static void main(String[] args) {
        String str1="ABCDE";
        String str2="ABCDe";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        if (str1.equals(str2)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("String not equal");
        }
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));

        String patt= "[A-Z] {1,}";
        System.out.println(str1.matches(patt));
    }
}

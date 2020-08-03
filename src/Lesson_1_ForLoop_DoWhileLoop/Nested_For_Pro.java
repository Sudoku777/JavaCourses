package Lesson_1_ForLoop_DoWhileLoop;
/*
Write a program to greate
      *
      **
      ***
      ****
      *****
      ******
 */
public class Nested_For_Pro {
    public static void main(String[] args) {
       for(int i = 1;i<=6;i++){
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
           System.out.println("\n");
       }
    }
}

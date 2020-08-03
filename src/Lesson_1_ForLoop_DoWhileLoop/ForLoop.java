package Lesson_1_ForLoop_DoWhileLoop;
/*
 *Write a program to find 20 numbers of Fibonacci Series
 *0 1 1 2 3 5 8 13 21
 */
public class ForLoop {
    public static void main(String[] args) {
        int num1 =0;
        int num2 =1;
        int num3 =0;

        System.out.println(num1);
        System.out.println(num2);

        for (int i=1;i<=18;i++){
            num3=num1+num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
        }
    }
}

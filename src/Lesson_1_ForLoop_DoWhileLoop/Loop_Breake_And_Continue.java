package Lesson_1_ForLoop_DoWhileLoop;

public class Loop_Breake_And_Continue {
    public static void main(String[] args) {
        int a= 100;
        while(a>50){
            a-=5;
            if(a==75){
                continue;
            }
            System.out.println(a);
        }
    }
}

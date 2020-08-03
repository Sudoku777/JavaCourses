package Lesson_1_ForLoop_DoWhileLoop;

public class While_Loop {
    public static void main(String[] args) {
       int a = 100;
      /* while(a>5) {
           a -= 5;
           System.out.println(a);
           }
      */
        do{
            a-=5;
            System.out.println(a);
        }while (a>500);
    }
}

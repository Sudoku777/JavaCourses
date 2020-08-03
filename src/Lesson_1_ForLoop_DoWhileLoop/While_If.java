package Lesson_1_ForLoop_DoWhileLoop;

/**
 * Если н ужно завершить цикл
 * то если условие ==true
 * испольщуем break;
 */
public class While_If {
    public static void main(String[] args) {
        int index =1;
        while(index<=100){
            index=index+5;
            if(index==400){
                break;
            }
        }
    }
}

package Lesson_1_ForLoop_DoWhileLoop;

public class Nested_For {
    public static void main(String[] args) {
        for(int i = 1;i<=10;i++){
            for(int j=1;j<=5;j++){
                System.out.println(i+","+j);
            }
            System.out.println("All Iteration of J are Done");
        }
    }
}

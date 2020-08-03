package Lesson_3_OOP_Concepts;

public class Temp {
    public static void main(String[] args) {
        Cars c1=new Cars();
        c1.color="red";
        c1.make="BMW";
        c1.type="hatchback";

        c1.displayDetails();
 Cars c2=new Cars();
        c2.color="black";
        c2.make="Mercedes";
        c2.type="sedan";
        c2.displayDetails();

    }
}

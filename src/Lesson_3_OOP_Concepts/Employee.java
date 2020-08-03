package Lesson_3_OOP_Concepts;
/**
 * @author Yusif_Guliyev
 *  ***Class Example
 *  1.Create an Employee Class
 *  2.Create class variable for Employee Name,Employee ID,Employee Salary
 *  3.Create a method to calculate and display Employee binus(20% of Employee salary)
 *  4.Create an Employee_Maim class with a Main Method
 *  5.Create 2 Objects of Employee Class in Employee_Main
 *  6.Assign values to variables and call the method from Employee Class by using the object created in step 5
 */
public class Employee {
    String empName = "ABC";
    int empId = 100;
    int empSalary = 100;

    public  void displayEmployeeBonus(){
        System.out.println("Employee "+ empName + " get the bonus of "+
                (empSalary*0.20));
    }
}

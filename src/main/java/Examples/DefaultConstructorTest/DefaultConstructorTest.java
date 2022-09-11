
package Examples.DefaultConstructorTest;

/**
 *
 * @author koonp@641102064111
 * Create on 8:43:23 PM Sep 11, 2022
 * This file is part of "Examples" Package.
 */
class Employee{
    public double emp_salary;
}
public class DefaultConstructorTest {
    public static void main(String[] args){
        String emp_id = "PE1005";
        Employee emp = new Employee();
        System.out.println("== Default Constructor ==");
        System.out.println("Employee ID = "+emp_id+"\nSalary = "+emp.emp_salary);
        System.out.println("=================");
    }

}

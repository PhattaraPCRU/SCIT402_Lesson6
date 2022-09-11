
package Examples.OverloadTest;

/**
 *
 * @author koonp@641102064111
 * Create on 8:55:13 PM Sep 11, 2022
 * This file is part of "Examples" Package.
 */
class Employee{
    String emp_id; double emp_salary;
    public Employee(){
        emp_id = "PE1105";
    }
    public Employee(double s){
        emp_salary = s;
    }
}
public class OverloadTest {
    public static void main(String[] args){
        double data = 20000;
        Employee emp1 = new Employee();
        Employee emp2 = new Employee(data);
        System.out.println("== Default Constructor ==");
        System.out.println("Employee ID = "+emp1.emp_id+"\nSalary = "+emp2.emp_salary);
        System.out.println("=================");
    }

}

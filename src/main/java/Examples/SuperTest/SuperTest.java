
package Examples.SuperTest;

/**
 *
 * @author koonp@641102064111
 * Create on 10:06:25 PM Sep 11, 2022
 * This file is part of "Examples.SuperTest" Package.
 */
class Employee{
    String emp_id; double emp_salary;
    public Employee(){
        emp_id = "PE1105";
    }
    public Employee(String n){
        emp_id = n;
    }
}
class EmployeeSal extends Employee{
    public EmployeeSal(double s){
        super("PE1000");
        emp_salary = s;
    }
}
public class SuperTest{ 
    public static void main(String[] args){
        double data = 40000;
        EmployeeSal emp = new EmployeeSal(data);
        System.out.println("== Default Constructor ==");
        System.out.println("Employee ID = "+emp.emp_id+"\nSalary = "+emp.emp_salary);
        System.out.println("=================");
    }

}

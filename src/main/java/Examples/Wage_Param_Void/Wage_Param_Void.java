
package Examples.Wage_Param_Void;
/**
 *
 * @author koonp@641102064111
 * Create on 3:00:22 PM Sep 10, 2022
 * This file is part of "Examples" Package.
 */
class wage {
    public void calWage(int h,float r){
        float total = (40*r)+(h-40)*(1.5f*r);
        System.out.println("total wage = "+total+" baht");
    }
}

public class Wage_Param_Void {
    public static void main(String[] args){
        wage emp_wage = new wage();
        emp_wage.calWage(50, 200.0f);
    }

}

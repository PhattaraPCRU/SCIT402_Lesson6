
package Examples.Wage_Param_Return;
/**
 *
 * @author koonp@641102064111
 * Create on 8:27:45 PM Sep 10, 2022
 * This file is part of "Examples" Package.
 */
class wage{
    public float calWage(int h,float r){
        return (40*r)+(h-40)*(1.5f*r);
    }
}
public class Wage_Param_Return {
    public static void main(String[] args){
        wage emp_wage = new wage();
        float total = emp_wage.calWage(50,400.0f);
        System.out.println("total wage = "+total+" baht");
    }

}

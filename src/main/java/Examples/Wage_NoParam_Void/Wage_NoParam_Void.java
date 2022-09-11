
package Examples.Wage_NoParam_Void;
/**
 *
 * @author koonp@641102064111
 * Create on 2:20:41 PM Sep 4, 2022
 * This file is part of "phattara.scit402_lesson6" Package.
 */
class wage{
    public int h;
    public float r;
    public void calWage(){
        float total = (40*r)+(h-40)*(1.5f*r);
        System.out.println("total wage = "
                +total+ " baht");
    }
}

public class Wage_NoParam_Void{
    public static void main(String[] args){
        wage emp_wage = new wage();
        emp_wage.h = 50; emp_wage.r = 100.0f;
        emp_wage.calWage();
    }
}

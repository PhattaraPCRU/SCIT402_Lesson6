
package Examples.WageMethod;

/**
 *
 * @author koonp@641102064111
 * Create on 10:25:50 PM Sep 10, 2022
 * This file is part of "Examples" Package.
 */
class wage{
    public float calWage(int h,float r){
        return (40*r)+calOt(h,r);
    }
    private float calOt(int h,float r){
        return (h-40)*(1.5f*r);
    }
}
public class WageMethod {
    public static void main(String[] args){
        wage emp_wage = new wage();
        float total = emp_wage.calWage(50,500.0f);
        System.out.printf("%s%,10.2f %s","total wage",total,"baht\n");
    }

}

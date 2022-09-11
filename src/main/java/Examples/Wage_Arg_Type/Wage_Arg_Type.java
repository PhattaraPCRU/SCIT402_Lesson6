
package Examples.Wage_Arg_Type;

/**
 *
 * @author koonp@641102064111
 * Create on 10:40:07 PM Sep 10, 2022
 * This file is part of "Examples" Package.
 */
class wage{
    public double calWage(float h,double r){
        return (40*r)+(h-40)*(1.5f*r);
    }
}
public class Wage_Arg_Type {
    public static void main(String[] args){
        wage x = new wage();
        int hr = 50; float rate = 600.0f;
        double total = x.calWage(hr,rate);
        System.out.printf("%s%,10.2f %s","total wage",total,"baht\n");
    }

}

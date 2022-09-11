
package Examples.statMethod;

/**
 *
 * @author koonp@641102064111
 * Create on 11:00:18 PM Sep 10, 2022
 * This file is part of "Examples" Package.
 */
class Bonus{
    public static float calBonus(float s){
        return 0.05f*s;
    }
}
public class statMethod {
    public static void main(String[] args){
        System.out.println("Bonus = "+Bonus.calBonus(40000)+" baht");
    }

}

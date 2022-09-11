
package Examples.instMethod;

/**
 *
 * @author koonp@641102064111
 * Create on 10:56:07 PM Sep 10, 2022
 * This file is part of "Examples" Package.
 */
class Bonus{
    public float calBonus(float s){
        return 0.05f*s;
    }
}
public class instMethod {
    public static void main(String[] args){
        System.out.println("Bonus = " + new Bonus().calBonus(50000)+ " baht");
    }

}

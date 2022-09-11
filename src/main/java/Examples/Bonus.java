
package Examples;

/**
 *
 * @author koonp@641102064111
 * Create on 11:09:01 AM Sep 11, 2022
 * This file is part of "Examples" Package.
 */
public class Bonus {
    public float myBonus;
    public Bonus(){
        myBonus = 0;
    }
    public float calBonus(float s){
        myBonus = 0.05f*s;
        return myBonus;
    }

}


package Examples.constMethod;

import Examples.Bonus;

/**
 *
 * @author koonp@641102064111
 * Create on 11:08:31 AM Sep 11, 2022
 * This file is part of "Examples" Package.
 */
public class constMethod {
    public static void main(String[] args){
        System.out.println("Bonus = "+new Bonus().myBonus+" baht");
        System.out.println("Bonus = "+new Bonus().calBonus(30000)+" baht");
        
    }

}


package Examples;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author koonp@641102064111
 * Create on 7:33:54 PM Sep 11, 2022
 * This file is part of "Examples" Package.
 */
public class Dates {
    public static void main(String[] args){
        Date DateName = new Date();
        SimpleDateFormat df = new SimpleDateFormat("d-MM-yyyy KK:mm a");
        System.out.println("Current DateTime is : "+df.format(DateName.getTime()));
    }

}

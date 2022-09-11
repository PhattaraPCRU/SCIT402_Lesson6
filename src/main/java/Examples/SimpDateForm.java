
package Examples;

import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 *
 * @author koonp@641102064111
 * Create on 6:08:04 PM Sep 11, 2022
 * This file is part of "Examples" Package.
 */
public class SimpDateForm {
    public static void main(String[] args){
        Calendar calenName = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("d/MM/yyyy HH:mm:ss");
        System.out.println("Current DateTime is : "+df.format(calenName.getTime()));
    }
}

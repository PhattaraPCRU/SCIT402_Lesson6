
package Examples;

/**
 *
 * @author koonp@641102064111
 * Create on 3:24:27 PM Sep 11, 2022
 * This file is part of "Examples" Package.
 */
class shape{
    public float calArea(float x,float y){
        return 0;
    }
}
class tri extends shape{
    @Override
    public float calArea(float x,float y){
        return 0.5f*x*y;
    }
}
class rec extends shape{
    @Override
    public float calArea(float x,float y){
        return x*y;
    }
}
public class OverridingMethod {
    public static void main(String[] args){
        System.out.println("triangle area = "+new tri().calArea(2,2));
        System.out.println("triangle area = "+new rec().calArea(2,2));
    }

}

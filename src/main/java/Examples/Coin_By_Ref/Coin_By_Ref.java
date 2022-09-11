
package Examples.Coin_By_Ref;

/**
 *
 * @author koonp@641102064111
 * Create on 10:48:38 PM Sep 10, 2022
 * This file is part of "Examples" Package.
 */
class coins{
    int ten,five,one;
}
class ExchangeCoin{
    public void findCoin(coins c,int m){
        c.ten = m/10;
        c.five = m%10/5;
        c.one = m%10%5;
    }
}
public class Coin_By_Ref {
    public static void main(String[] args){
        int money = 29;
        coins coin = new coins();
        ExchangeCoin coinData = new ExchangeCoin();
        coinData.findCoin(coin, money);
        System.out.println("money "+" baht exchabge to"+" ten coin"+coin.ten+" five coin "+coin.five+" one coin "+coin.one);
    }

}

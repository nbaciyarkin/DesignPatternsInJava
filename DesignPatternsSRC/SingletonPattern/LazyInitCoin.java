package SingletonPattern;

public class LazyInitCoin {
    private static final int add_coin_balance = 10;
    private  int balance;

    private static LazyInitCoin coin;

    private LazyInitCoin(){}

    public static LazyInitCoin getInstance(){
        if (coin == null){
            coin = new LazyInitCoin();
        }
        return coin;
    }


    public int getBalance(){
        return balance;
    }

    public void addBalance(){
        balance = balance + add_coin_balance; }         // adding coin balance

    public void subtractBalance(){
        balance--; }
}

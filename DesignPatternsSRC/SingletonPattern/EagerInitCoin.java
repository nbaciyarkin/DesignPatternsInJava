package SingletonPattern;

public class EagerInitCoin {

    private static final int add_coin_balance = 10;
    private  int balance;

    private static LazyInitCoin coin;

    private static final EagerInitCoin instance = new EagerInitCoin();

    public EagerInitCoin() {
    }

    public static EagerInitCoin getInstance(){
        return instance;
    }

    public int getBalance(){
        return balance;
    }

    public void addBalance(){
        balance = balance + add_coin_balance; }         // adding coin balance

    public void subtractBalance(){
        balance--; }



}

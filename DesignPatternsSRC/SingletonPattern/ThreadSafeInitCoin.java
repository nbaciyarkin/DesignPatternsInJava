package SingletonPattern;

public class ThreadSafeInitCoin {

    private static final int add_coin_balance = 10;
    private  int balance;

    private static ThreadSafeInitCoin instance;

    private ThreadSafeInitCoin(){}

    public static synchronized ThreadSafeInitCoin getInstance(){
        if (instance == null){
            instance = new ThreadSafeInitCoin();
        }
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

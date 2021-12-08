package SingletonPattern;

public class Test {

    public static void main(String[] args) {

       LazyInitCoin coin1_lazy = LazyInitCoin.getInstance();

       LazyInitCoin coin2_lazy = LazyInitCoin.getInstance(); // lAZY Inıt Coin

        System.out.println("LazyCoin-----------------------------");

        coin1_lazy.addBalance();
        System.out.println("coin1_lazy.getBalance() = "+coin1_lazy.getBalance());
        System.out.println("coin1_lazy.getBalance() = "+coin2_lazy.getBalance());

        coin1_lazy.subtractBalance();
        System.out.println("coin1_lazy.getBalance() = "+coin1_lazy.getBalance());
        System.out.println("coin1_lazy.getBalance() = "+coin2_lazy.getBalance());

        System.out.println(coin1_lazy);
        System.out.println(coin2_lazy);


        EagerInitCoin coin1_eager = EagerInitCoin.getInstance();

        EagerInitCoin coin2_eager = EagerInitCoin.getInstance(); // Eager Inıt Coin

        System.out.println("EagerCoin-----------------------------");

        coin1_eager.addBalance();
        System.out.println("coin1_eager.getBalance() = "+coin1_eager.getBalance());
        System.out.println("coin2_eager.getBalance() = "+coin1_eager.getBalance());

        coin1_eager.subtractBalance();
        System.out.println("coin1_eager.getBalance() = "+coin1_eager.getBalance());
        System.out.println("coin2_eager.getBalance() = "+coin2_eager.getBalance());

        System.out.println(coin1_eager);
        System.out.println(coin2_eager);



        ThreadSafeInitCoin coin1_threadSafe = ThreadSafeInitCoin.getInstance();

        ThreadSafeInitCoin coin2_threadSafe = ThreadSafeInitCoin.getInstance(); // Eager Inıt Coin



        System.out.println("ThreadSafeCoin-----------------------------");

        coin1_threadSafe.addBalance();
        System.out.println("coin1_threadSafe.getBalance() = "+coin1_threadSafe.getBalance());
        System.out.println("coin2_threadSafe.getBalance() = "+coin2_threadSafe.getBalance());

        coin1_threadSafe.subtractBalance();
        System.out.println("coin2_threadSafe.getBalance()) = "+coin1_threadSafe.getBalance());
        System.out.println("coin2_threadSafe.getBalance()) = "+coin2_threadSafe.getBalance());

        System.out.println(coin1_threadSafe);
        System.out.println(coin2_threadSafe);

    }
}

package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Priority mt1 = new Priority("Watek o wysokim priorytecie ");
        Priority mt2 = new Priority("Watek o niskim priorytecie ");
        Priority mt3 = new Priority("Watek nr 1 o normalnym priorytecie ");
        Priority mt4 = new Priority("Watek nr 2 o normalnym priorytecie ");
        Priority mt5 = new Priority("Watek nr 3 o normalnym priorytecie ");

        mt1.thrd.setPriority(Thread.NORM_PRIORITY+2);
        mt2.thrd.setPriority(Thread.NORM_PRIORITY-2);

        mt1.thrd.run();
        mt2.thrd.run();
        mt3.thrd.run();
        mt4.thrd.run();
        mt5.thrd.run();

        try {
            mt1.thrd.join();
            mt2.thrd.join();
            mt3.thrd.join();
            mt4.thrd.join();
            mt5.thrd.join();
        } catch (InterruptedException exc ){
            System.out.println("Głowny watek rozpoczyna dzialanie ");
        }
        System.out.println("\nWątek o wysokim priortecie doliczył do " + mt1.count);
        System.out.println("\nWątek o niskim priortecie doliczył do " + mt2.count);
        System.out.println("\nWątek o normalnym priortecie doliczył do " + mt3.count);
        System.out.println("\nWątek o normalnym priortecie doliczył do " + mt4.count);
        System.out.println("\nWątek o normalnym priortecie doliczył do " + mt5.count);
    }
}

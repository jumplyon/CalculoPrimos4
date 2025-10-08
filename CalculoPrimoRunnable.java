class CalculoPrimo implements Runnable {
    private int inicio, fim;

    public CalculoPrimo( int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
    }
    private boolean isprime(int n) {
        if (n < 2) return false;
        for( int i =2; i <= Math.sqrt(n); i++) {
            if ( n % i == 0) return false;
        }
        return true;
    }

    @Override
    public void run() {
        System.out.println("[" + inicio + "-" + fim + "]" + "Primos encontrados: ");
        for ( int i = inicio; i<= fim; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");
            }

        }
    }

}
public class CalculoPrimos4 {
    public static void main(String[] args) {
        int inicio = 5;
        int fim = 150;
        int parada1 = 5 * 10;
        int parada2 = 5 * 20;

        Runn

        Thread t1 = new CalculoPrimo4(inicio, parada1);
        Thread t2 = new CalculoPrimo4(parada1 + 1, parada2);
        Thread t3 = new CalculoPrimo4(parada2 + 1, fim);

        t1.start();
        t2.start();
        t3.start();
    }
}
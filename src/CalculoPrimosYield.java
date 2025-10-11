package src;

class CalculoPrimo4Yield extends Thread{
    private int inicio, fim;

    public CalculoPrimo4Yield( int inicio, int fim) {
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
                    Thread.yield();
                }

            }
        }

}
public class CalculoPrimosYield {
    public static void main(String[] args) {
        int inicio = 5;
        int fim = 150;
        int parada1 = 5 * 10;
        int parada2 = 5 * 20;

        Thread t1 = new CalculoPrimo4Yield(inicio, parada1);
        Thread t2 = new CalculoPrimo4Yield(parada1 + 1, parada2);
        Thread t3 = new CalculoPrimo4Yield(parada2 + 1, fim);

        t1.start();
        t2.start();
        t3.start();
    }
}
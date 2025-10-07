class CalculoPrimos4 extends Thread{
    private int inicio, fim;

    public CalculoPrimos4( int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;

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
                isprime(i){
                    System.out.print(i + " ");
                }

            }
        }

    }
}

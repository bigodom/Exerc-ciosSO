
public class Media implements Runnable {

    int[] vetor;
    Contador contador;

    public Media(int[] vetor, Contador contador) {
        this.vetor = vetor;
        this.contador = contador;
    }

    public void run() {
        double media = 0;
        for (int v : vetor) {
            media += v;
        }
        for (int i = 0; i < 1000; i++) {
        	contador.incrementa();
		}
        media /= vetor.length;
        System.out.println("Média aritmética simples: " + media);
    }
}
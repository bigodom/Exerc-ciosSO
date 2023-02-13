import java.util.Arrays;

public class Mediana implements Runnable {

    int[] vetor;
    Contador contador;

    public Mediana(int[] vetor, Contador contador) {
        this.vetor = vetor;
        this.contador = contador;
    }

    public void run() {
        Arrays.sort(vetor);
        double mediana = (vetor[vetor.length/2] + vetor[(vetor.length-1)/2]) / 2.0;
        System.out.println("Mediana: " + mediana);
        for (int i = 0; i < 1000; i++) {
        	contador.decrementa();
		}
        
    }
}
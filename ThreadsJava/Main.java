
public class Main {

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Contador contador = new Contador();
        Thread t1 = new Thread(new Media(vetor, contador));
        Thread t2 = new Thread(new Mediana(vetor, contador));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Valor final do contador: " + contador.getValor());
    }

}

import java.util.Random;

public class NumerosPseudoAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt();
        double y = random.nextDouble();

        System.out.println("Inteiro: " + x);
        System.out.println("Double: " + y);

        // Limitando

        int z = random.nextInt(6) + 1; // dado

        System.out.println("Face do dado: " + z);
    }
}

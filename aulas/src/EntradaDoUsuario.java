import java.util.Scanner;

public class EntradaDoUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu nome? ");

        String name = scanner.nextLine();

        System.out.println("Quantos anos você tem? ");

        int age = scanner.nextInt();

        System.out.println("Oii, " + name);
        System.out.println("Tu tens " + age + "anos");

        // Tem um probleminha quando se usa nextLine depois de nextInt
    }
}

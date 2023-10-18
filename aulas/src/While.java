import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.print("Digite seu nome: ");
            name = scanner.nextLine();
        }

        System.out.println("Oi, " + name);

        scanner.close();
    }
}

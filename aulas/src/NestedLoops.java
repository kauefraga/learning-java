import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol;

        System.out.println("Digite um número de linhas: ");
        rows = scanner.nextInt();

        System.out.println("Digite um número de colunas: ");
        columns = scanner.nextInt();

        System.out.println("Digite um símbolo: (@, #, $...)");
        symbol = scanner.next();

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }
        }
    }
}

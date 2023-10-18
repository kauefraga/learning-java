public class Arrays2d {
    public static void main(String[] args) {
        // Pense em linhas e colunas
        String[][] cars = new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";

        cars[1][0] = "Mustang";
        cars[1][1] = "Ranger";
        cars[1][2] = "F-150";

        cars[2][0] = "Ferrari";
        cars[2][1] = "Lambo";
        cars[2][2] = "Tesla";

        // Vamos precisar de um loop aninhado (nested)
        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j]);
            }
        }

        // Versão melhorada
        for (String[] garage : cars) {
            System.out.println();
            for (String car : garage) {
                System.out.print(car);
                System.out.print(" ");
            }
        }
    }
}

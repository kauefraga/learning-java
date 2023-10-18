import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        /*
        A diferença entre um array e uma array list é que uma array list pode
        mudar de tamanho depois da compilação, em runtime. Só armazena tipos
        de referência (reference data type) ou não-primitivos
         */

        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Hamburguer");
        food.add("Cachorro-quente");

        food.set(1, "Sushi");
        food.remove(2);
        // food.clear();

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}

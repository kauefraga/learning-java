import java.util.InputMismatchException;

public class Exceptions {
    public static void main(String[] args) {
        // event durante a execução que sai da rotina, um erro, um comportamento inesperado...

        try {
            double x = 5;
            double y = 0;
            String z = "pizza";

            double a = x / y;
        }
        catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero");
        }
        catch (InputMismatchException e) {
            System.out.println("Please use numbers :)");
        }
        catch (Exception e) {
            System.out.println("Alguma coisa deu errado. " + e.getMessage());
        }
        finally {
            System.out.println("Isso sempre aparecerá, ao final");
        }
    }
}

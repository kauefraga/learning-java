public class ExpressoesIf {
    public static void main(String[] args) {
        int age = 15;

        if (age >= 18) {
            System.out.println("Tu é adulto");
        } else if (age > 14 && age < 18) {
            System.out.println("Tu é adolescente");
        } else {
            System.out.println("Tu tem " + age + " anos");
        }
    }
}

public class ExpressoesSwitch {
    public static void main(String[] args) {
        String dayOfWeek = "Segunda";

        switch (dayOfWeek) {
            case "Segunda": System.out.println("Hoje é segunda");
            break;
            case "Terça": System.out.println("Hoje é terça");
            break;
            case "Quarta": System.out.println("Hoje é quarta");
            break;
            case "Quinta": System.out.println("Hoje é quinta");
            break;
            case "Sexta": System.out.println("Hoje é sexta");
            break;
            default: System.out.println("Hoje é hoje, não tem ruim");
        }
    }
}

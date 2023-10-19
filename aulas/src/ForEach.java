import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {
        /*
        For each é o loop "melhorado"/enhanced
        - mais legível, menos flexível
        */
        String[] animals = { "gato", "cachorro", "pássaro", "rato" };

        for (String animal : animals) {
            System.out.println(animal);
        }

        ArrayList<String> subjects = new ArrayList<String>();
        subjects.add("math");
        subjects.add("chemistry");
        subjects.add("physics");
        subjects.add("history");

        for (String subject : subjects) {
            System.out.println(subject);
        }
    }
}

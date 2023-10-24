import java.io.File;

public class Arquivos {
    public static void main(String[] args) {
        File file = new File("D:/www/learning-java/aulas/arquivo.txt");

        if (file.exists()) {
            System.out.println("O arquivo existe!");
        } else {
            System.out.println("O arquivo não existe.");
        }

        System.out.println(file.getPath());
        System.out.println(file.isFile());
        System.out.println(file.getAbsoluteFile());

        //file.delete();
    }
}

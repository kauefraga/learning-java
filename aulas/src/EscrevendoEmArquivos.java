import java.io.FileWriter;
import java.io.IOException;

public class EscrevendoEmArquivos {
    public static void main(String[] args) throws IOException {

        try {
            FileWriter fileWriter = new FileWriter("escrevendo.txt");

            fileWriter.write("É O JAVINHA MEU CAMARADA");
            fileWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

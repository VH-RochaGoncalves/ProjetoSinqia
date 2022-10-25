import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class tratamentoDeExcecao {
    public static void main(String[] args) {
        FileInputStream stream;
        try {
            stream = getFileInputStream();
        } catch (FileNotFoundException e){
            System.err.println("Não foi possível abrir o arquivo");
            e.printStackTrace();
            return;
        }
        try {
            readAllFile(stream);
        } catch (IOException e) {

        }
    }
}

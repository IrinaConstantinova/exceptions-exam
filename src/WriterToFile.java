import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterToFile {

    private static final String FILE_EXTENSION = ".txt";

    public void writeUserDataToFile(User user){
        String fileName = user.getSurname() + FILE_EXTENSION;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))){
            writer.write(user.toString());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Ошибка записи пользовательских данных в файл: " + e.getMessage());;
        }
    }
}

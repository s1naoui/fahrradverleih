import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class fahrradverleih {

    public static String readJsonFile(String dateiPfad) {
        try {
            System.out.println(dateiPfad);
            return Files.readString(Path.of(dateiPfad));
        } catch (IOException e) {
            System.out.println(dateiPfad);
            return null;
        }
    }

    public static void main(String[] args) {

        String daten = readJsonFile("fahrradverleih.json");

        if (daten != null) {
            System.out.println(daten);
        }
    }
}
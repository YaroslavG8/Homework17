import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertiesTask {

    public static void main(String[] args) throws IOException {

        File file = new File("c:/data.properties");
        Properties properties = new Properties();
        properties.load(new FileReader(file));

        String directory = properties.getProperty("directory");

        System.out.println(directory);

    }
}

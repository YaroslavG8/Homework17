import java.lang.String;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class FileTask {
    public static void main(String[] args) throws IOException {

        Files.createFile(Path.of("c:\\sample.txt"));

        Files.createDirectory(Path.of("c:\\sample"));

        String FILENAME = "src/sample.txt";

        Path path = Path.get(FILENAME);

        Files.writeString(path,"i am a QA automation");

        Path path1 = Path.of("c:\\sample.txt");
        Path path2 = Path.of("c:\\sample-new.txt");
        Files.move(path1, path2);


        Files.readAllLines(path);
        for (String item:Files.readAllLines(path)){
            System.out.println(item);
        }



        String fileName = "text.txt";
        ClassLoader classLoader = FileTask.class.getClassLoader();
        Path file = Paths.get(classLoader.getResource(fileName).getPath());

        System.out.println(file);

    }
}

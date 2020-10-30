package by.issoft.story;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextReader {
    public String readTextFromFile(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        String fileContent = new String(Files.readAllBytes(path));
        return fileContent;

    }
}

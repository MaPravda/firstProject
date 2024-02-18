package sazonenkoAleksandr_CriptoCaesar.ru.file;

import jdk.dynalink.StandardOperation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileService {
    private static final StandardOpenOption[] FILE_WRITE_OPTIONS =
            {StandardOpenOption.CREATE, StandardOpenOption.APPEND};

    public List<String> readFile(String fileName) {
        try {
            Path filePath = Path.of(fileName);
            return Files.readAllLines(filePath);
        } catch (IOException | InvalidPathException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public void addToFile(String fileNane, String content) {
        try {
            Path filePath = Path.of(fileNane);
            Files.writeString(filePath, content, FILE_WRITE_OPTIONS);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

}
package sazonenkoAleksandr_CriptoCaesar.ru.file;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.List;

import static sazonenkoAleksandr_CriptoCaesar.ru.constants.Constants.SEPARATOR;

public class FilenameValidator extends FileService {
    private static final List<String> FORBIDDEN_DIRECTIONS_FILE =
            List.of(".bash_history", ".bash_profile", "etc", "proc", "windows", "programData", "System32", "SysWOW64", "program");

    public void validateForWriting(String fileName) {
        Path path = validatePath(fileName);

        if (Files.exists(path)) {
            if (Files.isDirectory(path)) {
                throw new RuntimeException("Файл " + path + " директория");
            }
            if (!Files.isWritable(path)) {
                throw new RuntimeException("Файл: " + path + " недоступен для записи");
            }
        }

    }

    public void validateForReading(String fileName) {
        Path path = validatePath(fileName);

        if (Files.notExists(path)) {
            throw new RuntimeException("Файл: " + path + " не существует");
        }
        if (Files.isDirectory(path)) {
            throw new RuntimeException("Файл: " + path + " директория");
        }
        if (!Files.isReadable(path)) {
            throw new RuntimeException("Не возможно прочитать данный файл: " + path);
        }
    }

    private Path validatePath(String fileName) {
/*        for (String pathPart : fileName.split(System.getProperty(File.separator))) {
            if (FORBIDDEN_DIRECTIONS_FILE.contains(pathPart)) {
                throw new RuntimeException("Файл содержит недопустимое место записи" + pathPart);
            }
        }*/
        try {
            Path path = Path.of(fileName);
            return path;
        } catch (InvalidPathException e) {
            throw new RuntimeException("Неверный путь файла " + e.getMessage(), e);
        }
    }
}

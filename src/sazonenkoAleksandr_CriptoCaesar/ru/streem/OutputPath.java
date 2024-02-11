package sazonenkoAleksandr_CriptoCaesar.ru.streem;

import javax.swing.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class OutputPath {
    private Path path;

    public void readPath() {
        Scanner scanner = new Scanner(System.in);
        String outputAdressFile = scanner.nextLine();
        this.path = Path.of(outputAdressFile);

    }

    public void whriteFile(Action action) {
        try {
            Files.writeString(path, action.getInputText())
        }
    }
}

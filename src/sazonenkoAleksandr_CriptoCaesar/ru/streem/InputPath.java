package sazonenkoAleksandr_CriptoCaesar.ru.streem;
import sazonenkoAleksandr_CriptoCaesar.ru.action.Cryptoservis;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Scanner;

public class InputPath extends Cryptoservis {
    Scanner scanner = new Scanner(System.in);
    private Path path;
    private String inputText;

    public void readPath() {
        String inputAdressFile = scanner.nextLine();
        this.path = Path.of(inputAdressFile);
    }

    public void inputText() {
        try {
            this.inputText = Files.readString(path).toLowerCase();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String getInputText() {
        return inputText;
    }
    }

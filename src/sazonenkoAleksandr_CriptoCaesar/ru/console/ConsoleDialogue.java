package sazonenkoAleksandr_CriptoCaesar.ru.console;
import sazonenkoAleksandr_CriptoCaesar.ru.caesar.CaesarCoder;
import sazonenkoAleksandr_CriptoCaesar.ru.constants.Constants;

import java.util.Scanner;

public class ConsoleDialogue extends Constants {
    private static final String ACTION_NAME_PATTERN = "%d - %s;";


    private Scanner scanner;
    private CaesarCoder caesarCoder;

    public ConsoleDialogue() {
        scanner = new Scanner(System.in);
        caesarCoder = new CaesarCoder();
    }

    public void start() {
        showMenu();
        ActionName actionName = readActionName();
        processActionName(actionName);
    }

    private void showMenu() {

        System.out.println(Welcome);
/*        System.out.println(ENCRIPTION);
        System.out.println(DECODING);
        System.out.println(BRUTE_FORCE);
        System.out.println(ANALASIS);*/
        for (ActionName actionName : ActionName.values()) {
            String message = String.format(ACTION_NAME_PATTERN, actionName.getNumber(), actionName.getDescription());
            System.out.println(message);
        }
    }

    private void processActionName(ActionName actionName) {
        switch(actionName) {
            case EXIT -> processExit();
            case ENCRYPTION -> processEncryption();
            case DECODING -> processDecryption();
            case BRUTEFORCE -> processBruteForce();
            case ANALYSIS -> processAnalasis();
        }
    }

    private void processExit() {
        System.out.println("До скорой встречи");
    }

    private void processEncryption() {
        System.out.println(AT_THE_ENTRANCE);
        String inputFileName = readLine();

        System.out.println(FOR_RECORDING);
        String outputFileName = readLine();

        System.out.println(KEY);
        int key = readInt();

        try {
            CaesarCoder.encrypt(inputFileName, outputFileName, key);
            System.out.println("Готово");
        } catch (RuntimeException e) {
            System.err.println("Error причина: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void processDecryption() {
        System.out.println(FOR_DECRYPTION);
        String inputFileName = readLine();

        System.out.println(FOR_RECORDING);
        String outputFileName = readLine();

        System.out.println(KEY);
        int key = readInt();

        try {
            CaesarCoder.decoding(inputFileName, outputFileName, key);
            System.out.println("Готово");
        } catch (RuntimeException e) {
            System.err.println("Error причина: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void processBruteForce() {
        System.out.println(FOR_DECRYPTION);
        String inputFileName = readLine();

        System.out.println(FOR_RECORDING);
        String outputFileName = readLine();

        System.out.println(FOR_EXAMPLE);
        String dictionaryFileName = readLine();

        try {
            CaesarCoder.bruteForce(inputFileName, outputFileName, dictionaryFileName);
            System.out.println("Готово");
        } catch (RuntimeException e) {
            System.err.println("Error причина: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void processAnalasis() {
        System.out.println(FOR_DECRYPTION);
        String inputFileName = readLine();

        System.out.println(FOR_RECORDING);
        String outputFileName = readLine();

        System.out.println(FOR_EXAMPLE);
        String dictionaryFileName = readLine();

        try {
            CaesarCoder.analasis(inputFileName, outputFileName, dictionaryFileName);
            System.out.println("Готово");
        } catch (RuntimeException e) {
            System.err.println("Error причина: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private ActionName readActionName() {
        boolean shouldTryAgain = false;
        do {
            try {
                int option = readInt();
                return ActionName.getByNumber(option);
            } catch (IllegalArgumentException e) {
                System.out.println(INVALID_VALUES);
                System.out.println(ENTER_AGAIN_TYPING);

                String input = readLine();
                if (AGAIN_COMMAND.equalsIgnoreCase(input)) {
                    shouldTryAgain = true;
                }
            }
        } while (shouldTryAgain);

        return ActionName.EXIT;
    }
    private String readLine() {
        return scanner.nextLine();
    }

    private int readInt() {
        String input = scanner.nextLine();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new RuntimeException(INTEGER_INVALID, e);
        }
    }
}

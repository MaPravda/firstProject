package sazonenkoAleksandr_CriptoCaesar.ru.caesar;

import sazonenkoAleksandr_CriptoCaesar.ru.file.FileService;
import sazonenkoAleksandr_CriptoCaesar.ru.file.FilenameValidator;

import java.util.List;

public class CaesarCoder {

    private static CaesarCipher caesarCipher;
    private static FileService fileService;
    private static FilenameValidator validator;

    public CaesarCoder() {
        this.caesarCipher = new CaesarCipher(new CaesarAlphabet());
        this.fileService = new FileService();
        this.validator = new FilenameValidator();
    }

    public static void encrypt(String inputFileName, String outputFileName, int key) {
        validator.validateForReading(inputFileName);
        validator.validateForWriting(outputFileName);

        List<String> sourceLines = fileService.readFile(inputFileName);
        for (String sourceLine : sourceLines) {
            String encryptedLine = caesarCipher.encrypt(sourceLine, key);
            fileService.addToFile(outputFileName, encryptedLine);
        }
    }

    public static void decoding(String inputFileName, String outputFileName, int key) {
        validator.validateForReading(inputFileName);
        validator.validateForWriting(outputFileName);

        List<String> sourceLines = fileService.readFile(inputFileName);
        for (String sourceLine : sourceLines) {
            String decodingLine = caesarCipher.decoding(sourceLine, key);
            fileService.addToFile(outputFileName, decodingLine);
        }
    }

    public static void bruteForce(String inputFileName, String outputFileName, String dictionaryFileName) {
        validator.validateForReading(inputFileName);
        validator.validateForWriting(outputFileName);
        validator.validateForWriting(dictionaryFileName);
        String decryptText = null;

        List<String> sourceLines = fileService.readFile(inputFileName);
        for (String sourceLine : sourceLines) {
            String decodingLine = caesarCipher.bruteForce(sourceLine,dictionaryFileName, decryptText);
            fileService.addToFile(outputFileName, decodingLine);
        }
    }

    public static void analasis(String inputFileName, String outputFileName, String dictionaryFileName) {
        validator.validateForReading(inputFileName);
        validator.validateForWriting(outputFileName);
        validator.validateForWriting(dictionaryFileName);
        String decryptText = null;

        List<String> sourceLines = fileService.readFile(inputFileName);
        for (String sourceLine : sourceLines) {
            String decodingLine = caesarCipher.analysis(sourceLine,dictionaryFileName, decryptText);
            fileService.addToFile(outputFileName, decodingLine);
        }
    }
}

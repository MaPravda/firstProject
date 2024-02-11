package sazonenkoAleksandr_CriptoCaesar.ru.action;
import sazonenkoAleksandr_CriptoCaesar.ru.constants.Constants;
import sazonenkoAleksandr_CriptoCaesar.ru.streem.InputPath;
import sazonenkoAleksandr_CriptoCaesar.ru.streem.OutputPath;

import java.util.Scanner;

public class ChoseAction extends Constants {
    Scanner scanner = new Scanner(System.in);
    private int move;


    public void action() {
        new ChoseAction();

        System.out.println(ENCRIPTION);
        System.out.println(DECODING);
        System.out.println(BRUTE_FORCE);
        System.out.println(ANALASIS);
        Cryptoservis cryptoservis = new Cryptoservis();

        int move = scanner.nextInt();

        switch(move) {
            case 1: {
                EncryptionAction encryptionAction = new EncryptionAction();
                System.out.println(AT_THE_ENTRANCE);
                cryptoservis.setInputAdressFile(scanner.nextLine());
                System.out.println(FOR_RECORDING);
                cryptoservis.setOutputAdressFile(scanner.nextLine());
                System.out.println(KEY);
                cryptoservis.setKey(scanner.nextInt());
                encryptionAction.encryption(cryptoservis);

                break;
            }
            case 2: {
                DecodingAction decodingAction = new DecodingAction();
                System.out.println(FOR_DECRYPTION);
                cryptoservis.setInputAdressFile(scanner.nextLine());
                System.out.println(FOR_RECORDING);
                cryptoservis.setOutputAdressFile(scanner.nextLine());
                System.out.println(KEY);
                cryptoservis.setKey(scanner.nextInt());
                decodingAction.decoding(cryptoservis);
                break;
            }
            case 3: {
                BruteForceAction bruteForceAction = new BruteForceAction();
                System.out.println(AT_THE_ENTRANCE);
                cryptoservis.setInputAdressFile(scanner.nextLine());
                System.out.println(FOR_RECORDING);
                cryptoservis.setOutputAdressFile(scanner.nextLine());
                System.out.println(FOR_EXAMPLE);
                cryptoservis.setPathDictionary(scanner.nextLine());
                bruteForceAction.bruteForce(cryptoservis);
                break;
            }
            case 4: {

                System.out.println(AT_THE_ENTRANCE);
                String inputAdressFile = scanner.nextLine();
                System.out.println(FOR_RECORDING);
                String outputAdressFile = scanner.nextLine();
                System.out.println(FOR_EXAMPLE);
                String pathDictionary = scanner.nextLine();

            }
        }
    }
}

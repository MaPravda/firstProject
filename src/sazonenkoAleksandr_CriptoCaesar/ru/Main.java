package sazonenkoAleksandr_CriptoCaesar.ru;

import sazonenkoAleksandr_CriptoCaesar.ru.Constants;
import sazonenkoAleksandr_CriptoCaesar.ru.Cryptoservis;
import sazonenkoAleksandr_CriptoCaesar.ru.constants.Constants;

import java.util.Scanner;


public class Main extends Constants {



    public static void main(String[] args) {

        System.out.println(ENTER_THE_COMMAND);
        System.out.println(ENCRIPTION);
        System.out.println(DECODING);
        System.out.println(BRUTE_FORCE);
        System.out.println(ANALASIS);
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        switch (value) {
            case 1: {
                System.out.println(AT_THE_ENTRANCE);
                String path1 = scanner.nextLine();
                System.out.println(FOR_RECORDING);
                String path2 = scanner.nextLine();
                System.out.println(KEY);
                int key = scanner.nextInt();
                new Cryptoservis(path1, path2, key);
                break;
            }
            case 2: {
                System.out.println(FOR_DECRYPTION);
                String path1 = scanner.nextLine();
                System.out.println(FOR_RECORDING);
                String path2 = scanner.nextLine();
                System.out.println(KEY);
                int key = scanner.nextInt();
                new Cryptoservis(path1, path2, key);
                break;
            }
            case 3: {
                System.out.println(AT_THE_ENTRANCE);
                String path1 = scanner.nextLine();
                System.out.println(FOR_RECORDING);
                String path2 = scanner.nextLine();
                System.out.println(FOR_EXAMPLE);
                String path3 = scanner.nextLine();
                new Cryptoservis(path1, path2, path3);
                break;
            }
            case 4: {
                System.out.println(AT_THE_ENTRANCE);
                String path1 = scanner.nextLine();
                System.out.println(FOR_RECORDING);
                String path2 = scanner.nextLine();
                System.out.println(FOR_EXAMPLE);
                String path3 = scanner.nextLine();
                Cryptoservis(path1, path2, path3);

            }
        }
    }
}
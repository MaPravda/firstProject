package Command;

import Constants.Constants;
import Methods.Cryptoservis;
import Methods.Encryption;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Constants {
    public static void main(String[] args) {
        Cryptoservis cryptoservis = new Cryptoservis() {
            @Override
            public String getPath1() {
                return null;
            }

            @Override
            public void setPath1(String path1) {

            }

            @Override
            public String getPath2() {
                return null;
            }

            @Override
            public void setPath2(String path2) {

            }

            @Override
            public String getPath3() {
                return null;
            }

            @Override
            public void setPath3(String path3) {

            }

            @Override
            public int getKey() {
                return 0;
            }

            @Override
            public void setKey(int key) {

            }
        };

        System.out.println("Введите команду которую хотите выполнить");
        System.out.println("1 - Шифровать");
        System.out.println("2 - Расшифровать");
        System.out.println("3 - Brute Force");
        System.out.println("4 - Анализ");
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
            }
            case 2: {
                System.out.println(FOR_DECRYPTION);
                String path1 = scanner.nextLine();
                System.out.println(FOR_RECORDING);
                String path2 = scanner.nextLine();
                System.out.println(KEY);
                int key = scanner.nextInt();
                new Cryptoservis(path1, path2, key);
            }
            case 3: {
                System.out.println(AT_THE_ENTRANCE);
                String path1 = scanner.nextLine();
                System.out.println(FOR_RECORDING);
                String path2 = scanner.nextLine();
                System.out.println(FOR_EXAMPLE);
                String path3 = scanner.nextLine();
                new Cryptoservis(path1, path2, path3);
            }
            case 4: {
                System.out.println(AT_THE_ENTRANCE);
                String path1 = scanner.nextLine();
                System.out.println(FOR_RECORDING);
                String path2 = scanner.nextLine();
                System.out.println(FOR_EXAMPLE);
                String path3 = scanner.nextLine();
                new Cryptoservis(path1, path2, path3);
            }
        }
    }
}
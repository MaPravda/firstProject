package sazonenkoAleksandr_CriptoCaesar.ru.action;

import sazonenkoAleksandr_CriptoCaesar.ru.streem.InputPath;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class BruteForceAction extends Cryptoservis {
    int key;
    private Path pathDictionary;

    public BruteForceAction(int key, Path pathDictionary) {
        this.pathDictionary = pathDictionary;
    }
    public List<Character> bruteForce(InputPath inputText, Path pathDictionary) {
        int similarities = Integer.MIN_VALUE;
        int key = 0;
        List<Character> outputText = new ArrayList<>();

        for (int i = 0; i < ; i++) {
            
        }
    }    
}

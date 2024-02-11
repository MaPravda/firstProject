package sazonenkoAleksandr_CriptoCaesar.ru.action;

import sazonenkoAleksandr_CriptoCaesar.ru.streem.InputPath;
import sazonenkoAleksandr_CriptoCaesar.ru.constants.Constants;
import sazonenkoAleksandr_CriptoCaesar.ru.streem.OutputPath;

import java.util.ArrayList;
import java.util.List;

public class EncryptionAction extends Cryptoservis {


    public EncryptionAction(String inputAdressFile, String outputAdressFile, int key) {
        super(inputAdressFile, outputAdressFile, key);
    }

    public List<Character> encryption(Cryptoservis servis) {
        List<Character> outputText = new ArrayList<>();
        private String inputText;
        

        for (int i = 0; i < inputText.getInputText().length(); i++) {
            for (int j = 0; j < Constants.ALPHABET.length; j++) {
                int step = j + key;
                if (inputText.getInputText().charAt(i) == Constants.ALPHABET[j] && step < Constants.ALPHABET.length) {
                    outputText.add(Constants.ALPHABET[step]);
                    break;
                } else if (inputText.getInputText().charAt(i) == Constants.ALPHABET[j] && step >= Constants.ALPHABET.length) {
                    outputText.add(Constants.ALPHABET[step - Constants.ALPHABET.length);
                    break;
                }

            }
        }
        return outputText;
    }
    OutputPath outputPath = new OutputPath();
    OutputPath.whriteFile(ActionName);
}

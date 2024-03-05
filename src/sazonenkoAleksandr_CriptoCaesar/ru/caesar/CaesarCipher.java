package sazonenkoAleksandr_CriptoCaesar.ru.caesar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static sazonenkoAleksandr_CriptoCaesar.ru.constants.Constants.SPACE;
import static sazonenkoAleksandr_CriptoCaesar.ru.constants.Constants.ZERO;

public class CaesarCipher {


    private final CaesarAlphabet alphabet;

    public CaesarCipher(CaesarAlphabet alphabet) {
        this.alphabet = alphabet;
    }

    public String encrypt(String originalText, int key) {
        return  process(originalText, key);
    }

    public String decoding(String originalText, int key) {
        return  process(originalText, -key);
    }

    public String bruteForce(String originalText, String dictionaryText, String decryptText) {
        return processBrutForce(originalText, dictionaryText, decryptText);
    }

    public String analysis(String originalText, String dictionaryText, String decryptText) {
        return processAnalasis(originalText, dictionaryText, decryptText);
    }

    private String process(String originalText, int key) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < originalText.length(); i++) {
            Character originalChar = toLowerCase(originalText.charAt(i));
            int originalCharIndex = alphabet.getCharIndex(originalChar);
            int newCharIndex = (alphabet.getSize()) + (originalCharIndex + key) % alphabet.getSize();

            result.append(alphabet.getCharByIndex(newCharIndex));
        }
        return result.toString();
    }
    private Character toLowerCase(Character character) {
        return (character + "").toLowerCase().charAt(0);
    }

    private String processBrutForce(String originalText, String dictionaryText, String decryptText ) {
        StringBuilder result = new StringBuilder();
        int coincident = Integer.MIN_VALUE;
        int key = ZERO;

        Set<String> ofTenWordDictionary = findOfTenWords(dictionaryText);

        for (int i = ZERO; i < alphabet.getSize(); i++) {
            int tmpCoincidence = calculateCountMatchOftenWord(originalText, i, ofTenWordDictionary);

                if (tmpCoincidence > coincident) {
                    coincident = tmpCoincidence;
                    key = i;
                }


            for (int j = 0; j < originalText.length(); j++) {
                Character originalChar = toLowerCase(originalText.charAt(j));
                int originalCharIndex = alphabet.getCharIndex(originalChar);
                int newCharIndex = (alphabet.getSize()) + (originalCharIndex - key) % alphabet.getSize();

                result.append(alphabet.getCharByIndex(newCharIndex));
            }
            decryptText = result.toString();
        }
        return decryptText;
    }

    private String processAnalasis(String originalText, String dictionaryText, String decryptText ) {
        StringBuilder result = new StringBuilder();
        int coincident = Integer.MIN_VALUE;
        int key = ZERO;

        Set<String> ofTenWordDictionary = findOfTenWords(dictionaryText);

        for (int i = ZERO; i < alphabet.getSize(); i++) {
            int tmpCoincidence = calculateCountMatchOftenWord(originalText, i, ofTenWordDictionary);

            if (tmpCoincidence > coincident) {
                coincident = tmpCoincidence;
                key = i;
            }


            for (int j = 0; j < originalText.length(); j++) {
                Character originalChar = toLowerCase(originalText.charAt(j));
                int originalCharIndex = alphabet.getCharIndex(originalChar);
                int newCharIndex = (alphabet.getSize()) + (originalCharIndex - key) % alphabet.getSize();

                result.append(alphabet.getCharByIndex(newCharIndex));
            }
            decryptText = result.toString();
        }
        return decryptText;
    }
    public String getStringRepresentation(List<Character> list) {
        StringBuilder builder = new StringBuilder(list.size());
        for (Character ch : list) {
            builder.append(ch);
        }
        return builder.toString();
    }

    private int calculateCountMatchOftenWord(String originalText, int i, Set<String> ofTenWordDictionary) {
        int tmpCoincidence = 0;
        String cryptText = decoding(originalText, i);
        Set<String> ofTenWordCryptText = findOfTenWords(cryptText);

            for (String dictionary : ofTenWordDictionary) {
                for (String crypt : ofTenWordCryptText) {
                    if (dictionary.equals(crypt)) {
                        tmpCoincidence++;
                    }
                }
            }
            return tmpCoincidence;
    }

    private Set<String> findOfTenWords(String dictionaryText) {
        List<String> example = new ArrayList<>(List.of(dictionaryText.split(SPACE)));
        Set<String> statistic = new HashSet<>();
        for (String s : example) {
            if (s.length() < 4 && !s.equals(SPACE)) {
                statistic.add(s);
            }
        }
        return statistic;
    }
}

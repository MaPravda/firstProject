package sazonenkoAleksandr_CriptoCaesar.ru.caesar;

import java.util.*;

import static java.util.Arrays.asList;

public class CaesarAlphabet {
    public static final Character[] ALPHABET = {'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з',
            'и','к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
            'ъ', 'ы', 'ь', 'э', 'я', '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' '};
    private final List<Character> alphabet;
    private final Map<Character, Integer> charIndex;

    public CaesarAlphabet() {
        List<Character> creationAlphabet = new ArrayList<>();
        creationAlphabet.addAll(asList(ALPHABET));

        alphabet = List.copyOf(creationAlphabet);

        charIndex = new HashMap<>();
        for (int i = 0; i < alphabet.size(); i++) {
            charIndex.put(alphabet.get(i), i);
        }
    }

    public Character getCharByIndex(int index) {
        if (index < 0 || index > alphabet.size()) {
            throw new RuntimeException("Ошибка индекса: " + index + ". Действительна с 0 до" + alphabet.size());
        }
        return alphabet.get(index);
    }

    public int getCharIndex(Character character) {
        if (!charIndex.containsKey(character)) {
            throw new RuntimeException("Ошибка символа: " + character);
        }
        return charIndex.get(character);
    }
    public int getSize() {
        return alphabet.size();
    }
}

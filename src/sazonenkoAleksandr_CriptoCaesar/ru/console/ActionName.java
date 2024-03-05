package sazonenkoAleksandr_CriptoCaesar.ru.console;

import static sazonenkoAleksandr_CriptoCaesar.ru.constants.Constants.INCORRECTLE_ENTERED_NAME;
import static sazonenkoAleksandr_CriptoCaesar.ru.constants.Constants.INVALID_INPUT_VALUES;

public enum ActionName {
    EXIT(0, "Exit", () -> System.out.println("Выход")),
    ENCRYPTION(1, "Encryption", () -> System.out.println("Кодирование")),
    DECODING(2, "Decoding", () -> System.out.println("Раскодирование")),
    BRUTEFORCE(3, "Brute Force", () -> System.out.println("Брут форс")),
    ANALYSIS(4, "Analysis", () -> System.out.println("Анализ"));

    private final int number;
    private final String description;
    private final Runnable runnable;

    ActionName(int number, String description, Runnable runnable) {
        this.number = number;
        this.description = description;
        this.runnable = runnable;
    }

/*    private static ActionName getByNumber() {
        return null;
    }
    private static ActionName getByDescription() {
        return null;
    }*/

    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }
    public void run() {
        this.runnable.run();
    }

    public static ActionName getByNumber(int number) {
        for (ActionName actionName : values()) {
            if (actionName.getNumber() == number) {
                return actionName;
            }
        }
        throw new IllegalArgumentException(INVALID_INPUT_VALUES);
    }

/*    public static ActionName getByDescription(String description) {
        for (ActionName actionName : values()) {
            if (actionName.getDescription() == description) {
                return actionName;
            }
        }
        throw new IllegalArgumentException(INCORRECTLE_ENTERED_NAME);
    }*/
}

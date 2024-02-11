package sazonenkoAleksandr_CriptoCaesar.ru.action;

public enum ActionName {
    ENCRYPTION(new Encryption(), "Encryption"),
    DECODING(new Decoding(), "Decoding"),
    BRUTEFORCE(new BruteForce(), "BruteForce"),
    ANALYSIS(new Analysis(), "Analysis");

    private final ActionName actionName;
    private final ChoseAction choseAction;

}

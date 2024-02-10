package sazonenkoAleksandr_CriptoCaesar.ru.action;

import sazonenkoAleksandr_CriptoCaesar.Decoding;
import sazonenkoAleksandr_CriptoCaesar.Encryption;
import sazonenkoAleksandr_CriptoCaesar.ru.DecodingAction;
import sazonenkoAleksandr_CriptoCaesar.ru.Encryption;

public interface Cryptoservis (String path1, String path2, String path3, int Key) {

private String path1;
private String path2;
private String path3;
private int key;
Cryptoservis getInstance() {
    return DecodingAction;
}
Cryptoservis getInstance() {

    return Encryption;
}
static Cryptoservis getInstance(Cryptoservis BruteForce){
    return BruteForce;
}
static Cryptoservis getInstance() {
    return AnalysisAction;
}
}

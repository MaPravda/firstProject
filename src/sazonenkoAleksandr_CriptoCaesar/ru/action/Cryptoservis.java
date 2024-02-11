package sazonenkoAleksandr_CriptoCaesar.ru.action;


import sazonenkoAleksandr_CriptoCaesar.ru.streem.InputPath;
import sazonenkoAleksandr_CriptoCaesar.ru.streem.OutputPath;

public class Cryptoservis {
    private String inputAdressFile;
    private String outputAdressFile;
    private int key;
    private String pathDictionary;

    public String getInputAdressFile() {
        return inputAdressFile;
    }

    public void setInputAdressFile(String inputAdressFile) {
        this.inputAdressFile = inputAdressFile;
    }

    public String getOutputAdressFile() {
        return outputAdressFile;
    }

    public void setOutputAdressFile(String outputAdressFile) {
        this.outputAdressFile = outputAdressFile;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getPathDictionary() {
        return pathDictionary;
    }

    public void setPathDictionary(String pathDictionary) {
        this.pathDictionary = pathDictionary;
    }

    public Cryptoservis(String inputAdressFile, String outputAdressFile, int key, String pathDictionary) {
        this.inputAdressFile = inputAdressFile;
        this.outputAdressFile = outputAdressFile;
        this.key = key;
        this.pathDictionary = pathDictionary;
    }
}



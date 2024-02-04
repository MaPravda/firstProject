package Methods;

public interface Cryptoservis (String path1, String path2, String path3, int Key) {
    public String getPath1() {
        return path1;
    }

    public void setPath1(String path1) {
        this.path1 = path1;
    }

    public String getPath2() {
        return path2;
    }

    public void setPath2(String path2) {
        this.path2 = path2;
    }

    public String getPath3() {
        return path3;
    }

    public void setPath3(String path3) {
        this.path3 = path3;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

private String path1;
private String path2;
private String path3;
private int key;
Cryptoservis getInstance() {
    return Decoding;
}
Cryptoservis getInstance() {

    return Encryption;
}
Cryptoservis getInstance(){
    return BruteForce;
}
Cryptoservis getInstance() {
    return Analysis;
}
}

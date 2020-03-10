package list;

public class Data {
    private String editor;
    private int freq;

    public Data(String editor) {
        this.editor = editor;
        this.freq = 1;
    }

    public String getNama() {
        return this.editor;
    }

    public int getFreq(){
        return this.freq;
    }

    public void addFreq(){
        this.freq += 1;
    }
}
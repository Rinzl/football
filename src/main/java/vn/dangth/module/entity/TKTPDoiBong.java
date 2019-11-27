package vn.dangth.module.entity;

public class TKTPDoiBong {

    private DoiBong doiBong;
    private int soTheVang;
    private int soTheDo;
    private int soLoi;

    public TKTPDoiBong() {
    }

    public TKTPDoiBong(DoiBong doiBong, int soTheVang, int soTheDo, int soLoi) {
        this.doiBong = doiBong;
        this.soTheVang = soTheVang;
        this.soTheDo = soTheDo;
        this.soLoi = soLoi;
    }

    public DoiBong getDoiBong() {
        return doiBong;
    }

    public void setDoiBong(DoiBong doiBong) {
        this.doiBong = doiBong;
    }

    public int getSoTheVang() {
        return soTheVang;
    }

    public void setSoTheVang(int soTheVang) {
        this.soTheVang = soTheVang;
    }

    public int getSoTheDo() {
        return soTheDo;
    }

    public void setSoTheDo(int soTheDo) {
        this.soTheDo = soTheDo;
    }

    public int getSoLoi() {
        return soLoi;
    }

    public void setSoLoi(int soLoi) {
        this.soLoi = soLoi;
    }

    @Override
    public String toString() {
        return "TKTPDoiBong{" +
                "doiBong=" + doiBong +
                ", soTheVang=" + soTheVang +
                ", soTheDo=" + soTheDo +
                ", soLoi=" + soLoi +
                '}';
    }
}

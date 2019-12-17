package vn.dangth.module.entity;

public class TKTPDoiBongTheoTranDau extends TranDau {
    private int soTheVang;
    private int soTheDo;
    private int soLoi;

    public TKTPDoiBongTheoTranDau() {
    }

    public TKTPDoiBongTheoTranDau(int soTheDo, int soTheVang, int soLoi) {
        this.soTheVang = soTheVang;
        this.soTheDo = soTheDo;
        this.soLoi = soLoi;
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
        return "TKTPDoiBongTheoTranDau{" +
                "soTheVang=" + soTheVang +
                ", soTheDo=" + soTheDo +
                ", soLoi=" + soLoi +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TKTPDoiBongTheoTranDau that = (TKTPDoiBongTheoTranDau) o;

        if (soTheVang != that.soTheVang) return false;
        if (soTheDo != that.soTheDo) return false;
        return soLoi == that.soLoi;
    }

    @Override
    public int hashCode() {
        int result = soTheVang;
        result = 31 * result + soTheDo;
        result = 31 * result + soLoi;
        return result;
    }
}

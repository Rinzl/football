package vn.dangth.module.entity;

import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

@NamedNativeQueries({
        @NamedNativeQuery(
                name = "thongKeThePhatDoiBong",
                query = "CALL thongKeThePhatDoiBong()",
                resultClass = TKTPDoiBong.class
        )
})
public class TKTPDoiBong extends DoiBong implements Comparable<TKTPDoiBong> {

    private int soTheVang;
    private int soTheDo;
    private int soLoi;

    public TKTPDoiBong() {
    }

    public TKTPDoiBong(int soTheVang, int soTheDo, int soLoi) {
        this.soTheVang = soTheVang;
        this.soTheDo = soTheDo;
        this.soLoi = soLoi;
    }

    public TKTPDoiBong(String tenDoiBong, int soTheDo, int soTheVang, int soLoi) {
        super(tenDoiBong);
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
        return "TKTPDoiBong{" +
                "soTheVang=" + soTheVang +
                ", soTheDo=" + soTheDo +
                ", soLoi=" + soLoi +
                '}';
    }

    @Override
    public int compareTo(TKTPDoiBong o) {
        int result = Integer.compare(this.soTheDo, o.soTheDo);
        if (result == 0) {
            result = Integer.compare(this.soTheVang, o.soTheVang);
        }
        if (result == 0) {
            result = Integer.compare(this.soLoi, o.soLoi);
        }
        if (result == 0) result = this.getTenDoiBong().compareTo(o.getTenDoiBong());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TKTPDoiBong that = (TKTPDoiBong) o;

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

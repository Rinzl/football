package vn.dangth.module.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_loi")
public class Loi {
    @Id
    @GeneratedValue
    protected int id;
    @ManyToOne
    @JoinColumn(name = "id_ct_pham_loi")
    protected CauThu ctPhamLoi;
    @ManyToOne
    @JoinColumn(name = "id_ct_bi_pham_loi")
    protected CauThu ctPhamBiLoi;
    @ManyToOne
    @JoinColumn(name = "id_doi_bong")
    protected DoiBong doiBong;
    @ManyToOne
    @JoinColumn(name = "id_tran_dau")
    protected TranDau tranDau;
    @Column(name = "thoi_gian")
    protected int thoi_gian;

    public Loi() {
    }

    public Loi(int id, CauThu ctPhamLoi, CauThu ctPhamBiLoi, DoiBong doiBong, TranDau tranDau, int thoi_gian) {
        this.id = id;
        this.ctPhamLoi = ctPhamLoi;
        this.ctPhamBiLoi = ctPhamBiLoi;
        this.doiBong = doiBong;
        this.tranDau = tranDau;
        this.thoi_gian = thoi_gian;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CauThu getCtPhamLoi() {
        return ctPhamLoi;
    }

    public void setCtPhamLoi(CauThu ctPhamLoi) {
        this.ctPhamLoi = ctPhamLoi;
    }

    public CauThu getCtPhamBiLoi() {
        return ctPhamBiLoi;
    }

    public void setCtPhamBiLoi(CauThu ctPhamBiLoi) {
        this.ctPhamBiLoi = ctPhamBiLoi;
    }

    public DoiBong getDoiBong() {
        return doiBong;
    }

    public void setDoiBong(DoiBong doiBong) {
        this.doiBong = doiBong;
    }

    public TranDau getTranDau() {
        return tranDau;
    }

    public void setTranDau(TranDau tranDau) {
        this.tranDau = tranDau;
    }

    public int getThoi_gian() {
        return thoi_gian;
    }

    public void setThoi_gian(int thoi_gian) {
        this.thoi_gian = thoi_gian;
    }

    @Override
    public String toString() {
        return "Loi{" +
                "id=" + id +
                ", ctPhamLoi=" + ctPhamLoi +
                ", ctPhamBiLoi=" + ctPhamBiLoi +
                ", doiBong=" + doiBong +
                ", tranDau=" + tranDau +
                ", thoi_gian=" + thoi_gian +
                '}';
    }
}

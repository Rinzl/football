package vn.dangth.module.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_the_vang")
public class TheVang {
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

    public TheVang() {
    }

    public TheVang(int id, CauThu ctPhamLoi, CauThu ctPhamBiLoi, DoiBong doiBong, TranDau tranDau, int thoi_gian) {
        this.id = id;
        this.ctPhamLoi = ctPhamLoi;
        this.ctPhamBiLoi = ctPhamBiLoi;
        this.doiBong = doiBong;
        this.tranDau = tranDau;
        this.thoi_gian = thoi_gian;
    }

    @Override
    public String toString() {
        return "TheVang{" +
                "id=" + id +
                ", ctPhamLoi=" + ctPhamLoi +
                ", ctPhamBiLoi=" + ctPhamBiLoi +
                ", doiBong=" + doiBong +
                ", tranDau=" + tranDau +
                ", thoi_gian=" + thoi_gian +
                '}';
    }
}

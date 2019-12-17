package vn.dangth.module.entity;

import javax.persistence.*;

@Entity(name = "tbl_dang_ki_ct_tran_dau")
public class DangKiTranDau {
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_cau_thu")
    private CauThu cauThu;
    @ManyToOne
    @JoinColumn(name = "id_tran_dau")
    private TranDau tranDau;
    @ManyToOne
    @JoinColumn(name = "id_doi_bong")
    private DoiBong doiBong;

    public DangKiTranDau() {
    }

    public DangKiTranDau(int id, CauThu cauThu, TranDau tranDau, DoiBong doiBong) {
        this.id = id;
        this.cauThu = cauThu;
        this.tranDau = tranDau;
        this.doiBong = doiBong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CauThu getCauThu() {
        return cauThu;
    }

    public void setCauThu(CauThu cauThu) {
        this.cauThu = cauThu;
    }

    public TranDau getTranDau() {
        return tranDau;
    }

    public void setTranDau(TranDau tranDau) {
        this.tranDau = tranDau;
    }

    public DoiBong getDoiBong() {
        return doiBong;
    }

    public void setDoiBong(DoiBong doiBong) {
        this.doiBong = doiBong;
    }

    @Override
    public String toString() {
        return "DangKiTranDau{" +
                "id=" + id +
                ", cauThu=" + cauThu +
                ", tranDau=" + tranDau +
                ", doiBong=" + doiBong +
                '}';
    }
}

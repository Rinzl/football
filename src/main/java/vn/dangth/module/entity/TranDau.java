package vn.dangth.module.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Entity
@Table(name = "tbl_tran_dau")
public class TranDau {
    @Id
    @GeneratedValue
    @NotNull
    protected int id;
    @Column(name = "ngay_dau")
    protected java.sql.Date ngayDau;
    @ManyToOne
    @JoinColumn(name = "id_doi_nha")
    protected DoiBong doiNha;
    @ManyToOne
    @JoinColumn(name = "id_doi_khach")
    protected DoiBong doiKhach;
    @ManyToOne
    @JoinColumn(name = "id_san")
    protected San san;

    public TranDau() {
    }

    public TranDau(int id, Date ngayDau, DoiBong doiNha, DoiBong doiKhach, San san) {
        this.id = id;
        this.ngayDau = ngayDau;
        this.doiNha = doiNha;
        this.doiKhach = doiKhach;
        this.san = san;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getNgayDau() {
        return ngayDau;
    }

    public void setNgayDau(Date ngayDau) {
        this.ngayDau = ngayDau;
    }

    public DoiBong getDoiNha() {
        return doiNha;
    }

    public void setDoiNha(DoiBong doiNha) {
        this.doiNha = doiNha;
    }

    public DoiBong getDoiKhach() {
        return doiKhach;
    }

    public void setDoiKhach(DoiBong doiKhach) {
        this.doiKhach = doiKhach;
    }

    public San getSan() {
        return san;
    }

    public void setSan(San san) {
        this.san = san;
    }

    @Override
    public String toString() {
        return "TranDau{" +
                "id=" + id +
                ", ngayDau=" + ngayDau +
                ", doiNha=" + doiNha +
                ", doiKhach=" + doiKhach +
                ", san=" + san +
                '}';
    }
}

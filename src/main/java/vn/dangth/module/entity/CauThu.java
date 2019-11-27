package vn.dangth.module.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_cau_thu")
public class CauThu {
    @Id
    @GeneratedValue
    private int id;
    private String ten;
    private int tuoi;
    @Column(name = "vi_tri")
    private String viTri;
    @Column(name = "chan_thuan")
    private int chanThuan;
    @ManyToOne
    @JoinColumn(name = "id_doi_bong")
    private DoiBong doiBong;

    public CauThu() {
    }

    public CauThu(int id, String ten, int tuoi, String viTri, int chanThuan, DoiBong doiBong) {
        this.id = id;
        this.ten = ten;
        this.tuoi = tuoi;
        this.viTri = viTri;
        this.chanThuan = chanThuan;
        this.doiBong = doiBong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public int getChanThuan() {
        return chanThuan;
    }

    public void setChanThuan(int chanThuan) {
        this.chanThuan = chanThuan;
    }

    public DoiBong getDoiBong() {
        return doiBong;
    }

    public void setDoiBong(DoiBong doiBong) {
        this.doiBong = doiBong;
    }

    @Override
    public String toString() {
        return "CauThu{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", viTri='" + viTri + '\'' +
                ", chanThuan=" + chanThuan +
                ", doiBong=" + doiBong +
                '}';
    }
}

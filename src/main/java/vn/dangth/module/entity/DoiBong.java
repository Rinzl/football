package vn.dangth.module.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_doi_bong")
public class DoiBong {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "ten_doi_bong")
    private String tenDoiBong;
    @Column(name = "dia_chi")
    private String diaChi;
    private String tptt;
    @ManyToOne
    @JoinColumn(name = "id_san")
    private San san;

    public DoiBong() {
    }

    public DoiBong(int id, String tenDoiBong, String diaChi, String tptt, San san) {
        this.id = id;
        this.tenDoiBong = tenDoiBong;
        this.diaChi = diaChi;
        this.tptt = tptt;
        this.san = san;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenDoiBong() {
        return tenDoiBong;
    }

    public void setTenDoiBong(String tenDoiBong) {
        this.tenDoiBong = tenDoiBong;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getTptt() {
        return tptt;
    }

    public void setTptt(String tptt) {
        this.tptt = tptt;
    }

    public San getSan() {
        return san;
    }

    public void setSan(San san) {
        this.san = san;
    }

    @Override
    public String toString() {
        return "DoiBong{" +
                "id=" + id +
                ", tenDoiBong='" + tenDoiBong + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", tptt='" + tptt + '\'' +
                ", san=" + san +
                '}';
    }
}

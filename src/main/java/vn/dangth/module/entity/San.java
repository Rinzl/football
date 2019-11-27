package vn.dangth.module.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_san")
public class San {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "ten_san")
    private String tenSan;
    @Column(name = "dia_chi")
    private String diaChi;
    @Column(name = "suc_chua")
    private int sucChua;

    public San() {
    }

    public San(int id, String tenSan, String diaChi, int sucChua) {
        this.id = id;
        this.tenSan = tenSan;
        this.diaChi = diaChi;
        this.sucChua = sucChua;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSan() {
        return tenSan;
    }

    public void setTenSan(String tenSan) {
        this.tenSan = tenSan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    @Override
    public String toString() {
        return "San{" +
                "id=" + id +
                ", tenSan='" + tenSan + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", sucChua=" + sucChua +
                '}';
    }
}

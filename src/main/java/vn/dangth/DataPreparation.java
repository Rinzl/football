package vn.dangth;

import org.rapidoid.jpa.JPA;
import org.rapidoid.setup.App;
import vn.dangth.module.dao.TranDauDAO;
import vn.dangth.module.entity.DoiBong;
import vn.dangth.module.entity.Loi;
import vn.dangth.module.entity.TranDau;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataPreparation {
    public static void main(String[] args) throws SQLException {
        App.bootstrap(args).jpa();
        List<TranDau> matchList = TranDauDAO.getAllTranDau();
        Connection connection = JPA.bootstrapDatasource().getConnection();
//        insertLoi(connection, matchList);
//        insertRed(connection, matchList);
//        insertYellow(connection, matchList);
//        insertDangKi(connection, matchList);
    }

    static void insertLoi(Connection connection, List<TranDau> matchList) throws SQLException {
        PreparedStatement p = connection.prepareStatement("INSERT INTO tbl_loi (id_ct_pham_loi, id_ct_bi_pham_loi, id_doi_bong, id_tran_dau, thoi_gian) VALUES (?,?,?,?,?)");
        for (TranDau tranDau : matchList) {
            int idDn = tranDau.getDoiNha().getId();
            int idDk = tranDau.getDoiKhach().getId();
            int idTran = tranDau.getId();
            Random rd = new Random();
            for (int i =0;i< (rd.nextInt(25) + 1);i++) {
                p.setInt(1, rd.nextInt(460)+1);
                p.setInt(2, rd.nextInt(460)+1);
                int doi = rd.nextInt(2);
                p.setInt(3, doi == 0 ? idDn : idDk);
                p.setInt(4, idTran);
                p.setInt(5, rd.nextInt(89)+1);
                p.executeUpdate();
            }
        }
        System.out.println("DONE.");
        System.exit(0);
    }

    static void insertRed(Connection connection, List<TranDau> matchList) throws SQLException {
        PreparedStatement p = connection.prepareStatement("INSERT INTO tbl_the_do (id_ct_pham_loi, id_ct_bi_pham_loi, id_doi_bong, id_tran_dau, thoi_gian) VALUES (?,?,?,?,?)");
        Random rd = new Random();
        for (TranDau tranDau : matchList) {
            int idDn = tranDau.getDoiNha().getId();
            int idDk = tranDau.getDoiKhach().getId();
            int idTran = tranDau.getId();
            int red = rd.nextInt(11);
            if (red == 0) {
                p.setInt(1, rd.nextInt(460)+1);
                p.setInt(2, rd.nextInt(460)+1);
                int doi = rd.nextInt(2);
                p.setInt(3, doi == 0 ? idDn : idDk);
                p.setInt(4, idTran);
                p.setInt(5, rd.nextInt(89)+1);
                p.executeUpdate();
            }
        }
        System.out.println("DONE.");
        System.exit(0);
    }

    static void insertYellow(Connection connection, List<TranDau> matchList) throws SQLException {
        PreparedStatement p = connection.prepareStatement("INSERT INTO tbl_the_vang (id_ct_pham_loi, id_ct_bi_pham_loi, id_doi_bong, id_tran_dau, thoi_gian) VALUES (?,?,?,?,?)");
        Random rd = new Random();
        for (TranDau tranDau : matchList) {
            int idDn = tranDau.getDoiNha().getId();
            int idDk = tranDau.getDoiKhach().getId();
            int idTran = tranDau.getId();
            for (int i =0;i< (rd.nextInt(10) + 1);i++) {
                p.setInt(1, rd.nextInt(460)+1);
                p.setInt(2, rd.nextInt(460)+1);
                int doi = rd.nextInt(2);
                p.setInt(3, doi == 0 ? idDn : idDk);
                p.setInt(4, idTran);
                p.setInt(5, rd.nextInt(89)+1);
                p.executeUpdate();
            }
        }
        System.out.println("DONE.");
        System.exit(0);
    }

    static void insertDangKi(Connection connection, List<TranDau> matchList) throws SQLException {
        Random rd = new Random();
        PreparedStatement p = connection.prepareStatement("INSERT INTO football.tbl_dang_ki_ct_tran_dau (id_cau_thu, id_doi_bong, id_tran_dau) VALUES (?,?,?)");
        for (TranDau tranDau : matchList) {
            System.out.println(tranDau.getId());
            // doi nha
            DoiBong doiNha = tranDau.getDoiNha();
            for (int i = 0; i < 11; i++) {
                p.setInt(1, rd.nextInt(460)+1);
                p.setInt(2, doiNha.getId());
                p.setInt(3, tranDau.getId());
                p.executeUpdate();
            }

            // doi nha
            DoiBong doiKhach = tranDau.getDoiKhach();
            for (int i = 0; i < 11; i++) {
                p.setInt(1, rd.nextInt(460)+1);
                p.setInt(2, doiKhach.getId());
                p.setInt(3, tranDau.getId());
                p.executeUpdate();
            }
        }

        System.out.println("DONE");
        System.exit(0);
    }
}

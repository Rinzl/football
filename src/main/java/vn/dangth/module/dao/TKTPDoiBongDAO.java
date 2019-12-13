package vn.dangth.module.dao;

import org.rapidoid.jpa.JPA;
import vn.dangth.module.entity.DoiBong;
import vn.dangth.module.entity.TKTPDoiBong;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("ALL")
public class TKTPDoiBongDAO {
    public static TKTPDoiBong thongKe(DoiBong doiBong) {
        int soTheDo = TheDoDAO.countTheDoDoiBong(doiBong);
        int soTheVang = TheVangDAO.countTheVangDoiBong(doiBong);
        int soLoi = LoiDAO.countLoiDoiBong(doiBong);
        TKTPDoiBong tk = new TKTPDoiBong(soTheVang, soTheDo, soLoi);
        tk.setId(doiBong.getId());
        tk.setTenDoiBong(doiBong.getTenDoiBong());
        tk.setTptt(doiBong.getTptt());
        tk.setDiaChi(doiBong.getDiaChi());
        tk.setSan(doiBong.getSan());
        return tk;
    }

    public static List<TKTPDoiBong> thongKe() {
        List<TKTPDoiBong> thongKe = new ArrayList<>();
        try(Connection connection = JPA.bootstrapDatasource().getConnection();
            Statement statement = connection.createStatement()) {

            ResultSet rs = statement.executeQuery("CALL thongKeThePhatDoiBong()");
            while (rs.next()) {
                int id = rs.getInt("id");
                String tenDoiBong = rs.getString("ten_doi_bong");
                String tptt = rs.getString("tptt");
                int soTheDo = rs.getInt("so_the_do");
                int soTheVang = rs.getInt("so_the_vang");
                int loi = rs.getInt("so_loi");
                TKTPDoiBong tktpDoiBong = new TKTPDoiBong();
                tktpDoiBong.setId(id);
                tktpDoiBong.setTenDoiBong(tenDoiBong);
                tktpDoiBong.setTptt(tptt);
                tktpDoiBong.setSoLoi(loi);
                tktpDoiBong.setSoTheDo(soTheDo);
                tktpDoiBong.setSoTheVang(soTheVang);
                thongKe.add(tktpDoiBong);
            }
            return thongKe;
        } catch (SQLException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}

package vn.dangth.module.dao;

import org.rapidoid.jpa.JPA;
import vn.dangth.module.entity.DoiBong;
import vn.dangth.module.entity.TKTPDoiBongTheoTranDau;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TKTPDoiBongTheoTranDauDAO {
    public static List<TKTPDoiBongTheoTranDau> thongKe(DoiBong doiBong) {
        List<TKTPDoiBongTheoTranDau> tk = new ArrayList<>();
        try(Connection connection = JPA.bootstrapDatasource().getConnection();
            Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery(String.format("CALL `football`.`thongKeThePhatDoiBongTheoTranDau`(%s);", doiBong.getId()));
            while (rs.next()) {
                TKTPDoiBongTheoTranDau t = new TKTPDoiBongTheoTranDau();
                DoiBong doiNha = new DoiBong();
                DoiBong doiKhach = new DoiBong();

                int maTran = rs.getInt("ma_tran");
                int idDoiNha = rs.getInt("id_doi_nha");
                int idDoikhach = rs.getInt("id_doi_khach");
                String tenDoiNha = rs.getString("ten_doi_nha");
                String tenDoiKhach = rs.getString("ten_doi_khach");
                int soTheVang = rs.getInt("so_the_vang");
                int soTheDo = rs.getInt("so_the_do");
                int soLoi = rs.getInt("so_loi");

                t.setId(maTran);
                doiNha.setId(idDoiNha);
                doiNha.setTenDoiBong(tenDoiNha);
                doiKhach.setId(idDoikhach);
                doiKhach.setTenDoiBong(tenDoiKhach);
                t.setSoTheVang(soTheVang);
                t.setSoTheDo(soTheDo);
                t.setSoLoi(soLoi);
                t.setDoiNha(doiNha);
                t.setDoiKhach(doiKhach);
                tk.add(t);
            }

            return tk;
        } catch (SQLException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}

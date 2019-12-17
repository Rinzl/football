package vn.dangth.module.dao;

import org.rapidoid.jpa.JPA;
import vn.dangth.module.entity.DangKiTranDau;
import vn.dangth.module.entity.DoiBong;
import vn.dangth.module.entity.TranDau;

import java.util.List;

public class DangKiTranDauDAO {

    public static List<DangKiTranDau> getAll() {
        return JPA.of(DangKiTranDau.class).all();
    }

    public static List<DangKiTranDau> getDangKiByDoiBongAndTranDau(DoiBong doiBong, TranDau tranDau) {
        final String findRedCardByTeamQuery = "FROM DangKiTranDau t WHERE t.doiBong.id = %d and t.tranDau.id = %d";
        return JPA.jpql(String.format(findRedCardByTeamQuery, doiBong.getId(), tranDau.getId())).all();
    }
}

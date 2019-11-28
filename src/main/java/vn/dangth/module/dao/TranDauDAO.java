package vn.dangth.module.dao;

import org.rapidoid.jpa.JPA;
import vn.dangth.module.entity.DoiBong;
import vn.dangth.module.entity.TranDau;

import java.util.List;

public class TranDauDAO {
    public static List<TranDau> getAllTranDau() {
        return JPA.of(TranDau.class).all();
    }

    public static List<TranDau> getTranDauByDoiBong(DoiBong doiBong) {
        final String findMatchByTeam = "FROM TranDau t WHERE t.doiNha.id = %d or t.doiKhach.id = %d";
        return JPA.jpql(String.format(findMatchByTeam, doiBong.getId(), doiBong.getId())).all();
    }
}

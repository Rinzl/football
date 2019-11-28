package vn.dangth.module.dao;

import org.rapidoid.jpa.JPA;
import vn.dangth.module.entity.DoiBong;
import vn.dangth.module.entity.TheVang;
import vn.dangth.module.entity.TranDau;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class TheVangDAO {
    public static List<TheVang> getAllTheVang() {
        return JPA.of(TheVang.class).all();
    }

    public static int countTheVangDoiBong(DoiBong doiBong) {
        final String findRedCardByTeamQuery = "FROM TheVang t WHERE t.doiBong.id = %d";
        return JPA.jpql(String.format(findRedCardByTeamQuery, doiBong.getId())).all().size();
    }

    public static int countTheVangDoiBongTranDau(DoiBong doiBong, TranDau tranDau) {
        final String findRedCardByTeamQuery = "FROM TheVang t WHERE t.doiBong.id = %d and t.tranDau.id = %d";
        return JPA.jpql(String.format(findRedCardByTeamQuery, doiBong.getId(), tranDau.getId())).all().size();
    }
}

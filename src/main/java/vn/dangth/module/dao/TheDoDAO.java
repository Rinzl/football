package vn.dangth.module.dao;

import org.rapidoid.goodies.X;
import org.rapidoid.jpa.JPA;
import vn.dangth.module.entity.DoiBong;
import vn.dangth.module.entity.TheDo;
import vn.dangth.module.entity.TranDau;

import java.util.List;

public class TheDoDAO {
    public static List<TheDo> getAllTheDo() {
        return JPA.of(TheDo.class).all();
    }

    public static int countTheDoDoiBong(DoiBong doiBong) {
        final String findRedCardByTeamQuery = "FROM TheDo t WHERE t.doiBong.id = %d";
        return JPA.jpql(String.format(findRedCardByTeamQuery, doiBong.getId())).all().size();
    }

    public static int countTheDoDoiBongTranDau(DoiBong doiBong, TranDau tranDau) {
        final String findRedCardByTeamQuery = "FROM TheDo t WHERE t.doiBong.id = %d and t.tranDau.id = %d";
        return JPA.jpql(String.format(findRedCardByTeamQuery, doiBong.getId(), tranDau.getId())).all().size();
    }
}

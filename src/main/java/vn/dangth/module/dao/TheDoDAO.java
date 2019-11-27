package vn.dangth.module.dao;

import org.rapidoid.goodies.X;
import org.rapidoid.jpa.JPA;
import vn.dangth.module.entity.TheDo;

import java.util.List;

public class TheDoDAO {
    public static List<TheDo> getAllTheDo() {
        return JPA.of(TheDo.class).all();
    }

    public static int countTheDoDoiBong(int maDoi) {
        X.scaffold();
        final String findRedCardByTeamQuery = "FROM TheDo t WHERE t.doiBong.id = %d";
        return JPA.jpql(String.format(findRedCardByTeamQuery, maDoi)).all().size();
    }
}

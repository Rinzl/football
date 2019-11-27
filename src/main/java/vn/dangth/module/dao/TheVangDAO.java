package vn.dangth.module.dao;

import org.rapidoid.jpa.JPA;
import vn.dangth.module.entity.TheVang;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class TheVangDAO {
    public static List<TheVang> getAllTheVang() {
        return JPA.of(TheVang.class).all();
    }

    public static int countTheVangDoiBong(int maDoi) {
        final String findRedCardByTeamQuery = "FROM TheVang t WHERE t.doiBong.id = %d";
        CriteriaQuery<TheVang> cq = JPA.currentEM().getCriteriaBuilder().createQuery(TheVang.class);
        Root<TheVang> tv = cq.from(TheVang.class);
        return JPA.jpql(String.format(findRedCardByTeamQuery, maDoi)).all().size();
    }
}

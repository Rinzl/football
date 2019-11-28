package vn.dangth.module.dao;

import org.rapidoid.jpa.JPA;
import vn.dangth.module.entity.DoiBong;
import vn.dangth.module.entity.Loi;

import java.util.List;

public class LoiDAO {
    public static List<Loi> getAllLoi() {
        return JPA.of(Loi.class).all();
    }

    public static int countLoiDoiBong(DoiBong doiBong) {
        final String findRedCardByTeamQuery = "FROM Loi t WHERE t.doiBong.id = %d";
        return JPA.jpql(String.format(findRedCardByTeamQuery, doiBong.getId())).all().size();
    }
}

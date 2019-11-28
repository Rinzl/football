package vn.dangth.module.dao;

import org.rapidoid.jpa.JPA;
import vn.dangth.module.entity.DoiBong;
import vn.dangth.module.entity.Loi;
import vn.dangth.module.entity.TranDau;

import java.util.List;

public class LoiDAO {
    public static List<Loi> getAllLoi() {
        return JPA.of(Loi.class).all();
    }

    public static int countLoiDoiBong(DoiBong doiBong) {
        final String findRedCardByTeamQuery = "FROM Loi t WHERE t.doiBong.id = %d";
        return JPA.jpql(String.format(findRedCardByTeamQuery, doiBong.getId())).all().size();
    }

    public static int countLoiDoiBongTranDau(DoiBong doiBong, TranDau tranDau) {
        final String findRedCardByTeamQuery = "FROM Loi t WHERE t.doiBong.id = %d and t.tranDau.id = %d";
        return JPA.jpql(String.format(findRedCardByTeamQuery, doiBong.getId(), tranDau.getId())).all().size();
    }
}

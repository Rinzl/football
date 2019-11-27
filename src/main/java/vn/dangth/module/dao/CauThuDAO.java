package vn.dangth.module.dao;

import org.rapidoid.jpa.JPA;
import vn.dangth.module.entity.CauThu;

import java.util.List;

public class CauThuDAO {
    public static List<CauThu> getAllCauThu() {
        return JPA.of(CauThu.class).all();
    }
    public static CauThu getCauThuById(int id) {
        return JPA.get(CauThu.class, id);
    }
}

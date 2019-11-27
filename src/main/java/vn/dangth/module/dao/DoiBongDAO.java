package vn.dangth.module.dao;

import org.rapidoid.jpa.JPA;
import vn.dangth.module.entity.DoiBong;

import java.util.List;

public class DoiBongDAO {

    public static List<DoiBong> getAllDoiBong() {
        return JPA.of(DoiBong.class).all();
    }

    public static DoiBong getDoiBongById(int id) {
        return JPA.get(DoiBong.class, id);
    }
}

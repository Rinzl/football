package vn.dangth.module.dao;

import org.rapidoid.jpa.JPA;
import vn.dangth.module.entity.San;

import java.util.List;

public class SanDAO {
    public static List<San> getAllSan() {
        return JPA.of(San.class).all();
    }

    public static San getSanById(int id) {
        return JPA.get(San.class, id);
    }
}

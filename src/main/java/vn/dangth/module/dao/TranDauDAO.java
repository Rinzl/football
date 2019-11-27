package vn.dangth.module.dao;

import org.rapidoid.jpa.JPA;
import vn.dangth.module.entity.TranDau;

import java.util.List;

public class TranDauDAO {
    public static List<TranDau> getAllTranDau() {
        return JPA.of(TranDau.class).all();
    }
}

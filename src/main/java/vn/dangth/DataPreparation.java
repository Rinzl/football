package vn.dangth;

import org.rapidoid.jpa.JPA;
import org.rapidoid.setup.App;
import vn.dangth.module.dao.TranDauDAO;
import vn.dangth.module.entity.TranDau;

import java.util.ArrayList;
import java.util.List;

public class DataPreparation {
    public static void main(String[] args) {
        App.bootstrap(args).jpa();
        List<TranDau> matchList = TranDauDAO.getAllTranDau();
        for (TranDau tranDau : matchList) {
            System.out.println(tranDau);
        }
    }
}

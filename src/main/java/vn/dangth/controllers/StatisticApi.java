package vn.dangth.controllers;

import org.rapidoid.annotation.Controller;
import org.rapidoid.annotation.GET;
import org.rapidoid.cache.Cached;
import vn.dangth.module.dao.DoiBongDAO;
import vn.dangth.module.dao.TKTPDoiBongDAO;
import vn.dangth.module.entity.DoiBong;
import vn.dangth.module.entity.TKTPDoiBong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller("/api/statistic/")
public class StatisticApi {

    @GET("/all")
    @Cached(ttl = 60000)
    public List<TKTPDoiBong> getAllFoulStatistic() {
        List<DoiBong> teamList = DoiBongDAO.getAllDoiBong();

        List<TKTPDoiBong> tkList = new ArrayList<>();

        for (DoiBong doiBong : teamList) {
            tkList.add(TKTPDoiBongDAO.thongKe(doiBong));
        }
        Collections.sort(tkList);
        Collections.reverse(tkList);
        return tkList;
    }
}

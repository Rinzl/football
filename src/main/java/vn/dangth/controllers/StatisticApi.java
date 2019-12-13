package vn.dangth.controllers;

import org.rapidoid.annotation.Controller;
import org.rapidoid.annotation.GET;
import org.rapidoid.cache.Cached;
import vn.dangth.module.dao.TKTPDoiBongDAO;
import vn.dangth.module.entity.TKTPDoiBong;

import java.util.Collections;
import java.util.List;

@Controller("/api/statistic/")
public class StatisticApi {

    @GET("/all")
    @Cached(ttl = 60000)
    public List<TKTPDoiBong> getAllFoulStatistic() {
        List<TKTPDoiBong> tkList = TKTPDoiBongDAO.thongKe();
        Collections.sort(tkList);
        Collections.reverse(tkList);
        return tkList;
    }
}

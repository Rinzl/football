package vn.dangth.controllers;

import org.rapidoid.annotation.Controller;
import org.rapidoid.annotation.GET;
import org.rapidoid.cache.Cached;
import vn.dangth.module.dao.CauThuDAO;
import vn.dangth.module.entity.CauThu;

import java.util.List;

@Controller("/api/player/")
public class PlayerApi {

    @GET("/all")
    @Cached(ttl = 5000)
    public List<CauThu> getAllPlayer() {
        return CauThuDAO.getAllCauThu();
    }
}

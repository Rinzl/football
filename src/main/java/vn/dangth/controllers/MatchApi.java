package vn.dangth.controllers;

import org.rapidoid.annotation.Controller;
import org.rapidoid.annotation.GET;
import org.rapidoid.cache.Cached;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.dangth.module.dao.TranDauDAO;
import vn.dangth.module.entity.TranDau;

import java.util.List;

@Controller(value = "/api/match/")
public class MatchApi {

    private static Logger logger = LoggerFactory.getLogger(MatchApi.class);

    @GET("/all/")
    @Cached(ttl = 5000)
    public List<TranDau> getAllMatch() {
        logger.info("Get all matches info.");
        return TranDauDAO.getAllTranDau();
    }
}

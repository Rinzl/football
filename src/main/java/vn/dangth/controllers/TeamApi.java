package vn.dangth.controllers;

import org.rapidoid.annotation.Controller;
import org.rapidoid.annotation.GET;
import vn.dangth.module.dao.DoiBongDAO;
import vn.dangth.module.entity.DoiBong;

import java.util.List;

@Controller(value = "api/team/")
public class TeamApi {

    @GET("/all")
    public List<DoiBong> getAllTeam() {
        return DoiBongDAO.getAllDoiBong();
    }

    @GET("/id/{id}")
    public DoiBong getTeamById(int id) {
        return DoiBongDAO.getDoiBongById(id);
    }
}

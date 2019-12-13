package vn.dangth;

import org.rapidoid.data.JSON;
import org.rapidoid.setup.On;
import org.rapidoid.u.U;
import vn.dangth.module.dao.DoiBongDAO;
import vn.dangth.module.dao.TKTPDoiBongTheoTranDauDAO;
import vn.dangth.module.entity.DoiBong;

public class App {
    public static void main( String[] args ) {

        org.rapidoid.setup.App.bootstrap(args).jpa();
        //Main
        On.get("/home").view("home").mvc("OK");
        On.get("/").view("home").mvc("OK");
        On.get("/thongke").view("ThongKe").mvc("OK");
        On.get("/tktpdoibong").view("TKTPDoiBong").mvc("OK");
        On.get("/tktpdoibong/team/{id}").view("TKTPDoiBongTheoTranDau").mvc((Integer id) -> {
            DoiBong doiBong = DoiBongDAO.getDoiBongById(id);
            return U.map("data", JSON.MAPPER.writeValueAsString(TKTPDoiBongTheoTranDauDAO.thongKe(doiBong)), "thisTeam", JSON.MAPPER.writeValueAsString(doiBong));
        });
    }
}

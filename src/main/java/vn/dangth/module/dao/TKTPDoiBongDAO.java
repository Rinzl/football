package vn.dangth.module.dao;

import vn.dangth.module.entity.DoiBong;
import vn.dangth.module.entity.TKTPDoiBong;

public class TKTPDoiBongDAO {

    public static TKTPDoiBong thongKe(DoiBong doiBong) {
        int soTheDo = TheDoDAO.countTheDoDoiBong(doiBong);
        int soTheVang = TheVangDAO.countTheVangDoiBong(doiBong);
        int soLoi = LoiDAO.countLoiDoiBong(doiBong);
        TKTPDoiBong tk = new TKTPDoiBong(soTheVang, soTheDo, soLoi);
        tk.setId(doiBong.getId());
        tk.setTenDoiBong(doiBong.getTenDoiBong());
        tk.setTptt(doiBong.getTptt());
        tk.setDiaChi(doiBong.getDiaChi());
        tk.setSan(doiBong.getSan());
        return tk;
    }
}

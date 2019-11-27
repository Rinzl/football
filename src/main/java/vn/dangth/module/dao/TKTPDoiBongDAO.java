package vn.dangth.module.dao;

import vn.dangth.module.entity.DoiBong;
import vn.dangth.module.entity.TKTPDoiBong;

public class TKTPDoiBongDAO {

    public static TKTPDoiBong thongKe(DoiBong doiBong) {
        int maDoi = doiBong.getId();
        int soTheDo = TheDoDAO.countTheDoDoiBong(maDoi);
        int soTheVang = TheVangDAO.countTheVangDoiBong(maDoi);
        int soLoi = LoiDAO.countLoiDoiBong(maDoi);
        return new TKTPDoiBong(doiBong, soTheVang, soTheDo, soLoi);
    }
}

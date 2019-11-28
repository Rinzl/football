package vn.dangth.module.dao;

import vn.dangth.module.entity.DoiBong;
import vn.dangth.module.entity.TKTPDoiBongTheoTranDau;
import vn.dangth.module.entity.TranDau;

import java.util.ArrayList;
import java.util.List;

public class TKTPDoiBongTheoTranDauDAO {
    public static List<TKTPDoiBongTheoTranDau> thongKe(DoiBong doiBong) {
        List<TranDau> matches = TranDauDAO.getTranDauByDoiBong(doiBong);
        List<TKTPDoiBongTheoTranDau> tk = new ArrayList<>();
        for (TranDau match : matches) {
            TKTPDoiBongTheoTranDau t = new TKTPDoiBongTheoTranDau();
            int soLoi = LoiDAO.countLoiDoiBongTranDau(doiBong, match);
            int soTheVang = TheVangDAO.countTheVangDoiBongTranDau(doiBong, match);
            int soTheDo = TheDoDAO.countTheDoDoiBongTranDau(doiBong, match);
            t.setId(match.getId());
            t.setDoiNha(match.getDoiNha());
            t.setDoiKhach(match.getDoiKhach());
            t.setSan(match.getSan());
            t.setNgayDau(match.getNgayDau());
            t.setSoLoi(soLoi);
            t.setSoTheDo(soTheDo);
            t.setSoTheVang(soTheVang);
            tk.add(t);
        }
        return tk;
    }
}

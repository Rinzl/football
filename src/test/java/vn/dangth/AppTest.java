package vn.dangth;

import org.junit.Test;
import org.rapidoid.jpa.JPA;
import vn.dangth.module.dao.*;
import vn.dangth.module.entity.DoiBong;
import vn.dangth.module.entity.TKTPDoiBong;
import vn.dangth.module.entity.TKTPDoiBongTheoTranDau;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest extends IsolatedIntegrationTest {

    @Test
    public void testTKTPDoiBong() {
        JPA.bootstrap(path());
        TKTPDoiBong expectedResult = new TKTPDoiBong();
        expectedResult.setSoTheVang(73);
        expectedResult.setSoTheDo(5);
        expectedResult.setSoLoi(121);
        DoiBong doiBong = new DoiBong();
        doiBong.setId(16);
        TKTPDoiBong actualResult = TKTPDoiBongDAO.thongKe(doiBong);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testTKTPDoiBongAll() {
        List<TKTPDoiBong> expectedResult = new ArrayList<>();
        {
            expectedResult.add(new TKTPDoiBong("Tottenham", 5, 73, 121));
            expectedResult.add(new TKTPDoiBong("Southampton", 3, 70, 124));
            expectedResult.add(new TKTPDoiBong("West Brom", 2, 82, 113));
            expectedResult.add(new TKTPDoiBong("Crystal Palace", 2, 60, 103));
            expectedResult.add(new TKTPDoiBong("Bournemouth", 1, 86, 119));
            expectedResult.add(new TKTPDoiBong("Brighton and Hove", 1, 85, 122));
            expectedResult.add(new TKTPDoiBong("Manchester City", 1, 80, 115));
            expectedResult.add(new TKTPDoiBong("West Ham", 1, 76, 111));
            expectedResult.add(new TKTPDoiBong("Swansea", 1, 74, 109));
            expectedResult.add(new TKTPDoiBong("Watford", 1, 68, 128));
            expectedResult.add(new TKTPDoiBong("Stoke City", 1, 67, 119));
            expectedResult.add(new TKTPDoiBong("Leicester City", 1, 67, 118));
            expectedResult.add(new TKTPDoiBong("Liverpool", 1, 66, 123));
            expectedResult.add(new TKTPDoiBong("Huddersfield", 0, 87, 109));
            expectedResult.add(new TKTPDoiBong("Everton", 0, 82, 126));
            expectedResult.add(new TKTPDoiBong("Arsenal", 0, 82, 112));
            expectedResult.add(new TKTPDoiBong("Manchester United", 0, 73, 102));
            expectedResult.add(new TKTPDoiBong("Chelsea", 0, 71, 99));
            expectedResult.add(new TKTPDoiBong("Burnley", 0, 70, 110));
            expectedResult.add(new TKTPDoiBong("Newcastle United", 0, 55, 110));
        }
        List<TKTPDoiBong> actualResult = TKTPDoiBongDAO.thongKe();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testTKTPTheoTranDau() {
        List<TKTPDoiBongTheoTranDau> expectedResult = new ArrayList<>();
        {
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 2, 4));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 2, 4));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 2, 2));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 0, 4));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 4, 3));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 1, 1));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 2, 3));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 1, 2));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 3, 1));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 4, 3));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 1, 5));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 1, 5));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 3, 2));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 4, 6));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 1, 4));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 2, 1));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 5, 5));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 3, 0));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 2, 7));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 2, 2));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 1, 1));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 0, 1));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 0, 3));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 2, 3));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 5, 3));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 1, 7));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 1, 3));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 2, 1));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 6, 5));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 2, 2));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 1, 4));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 4, 3));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 2, 1));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 1, 2));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 1, 0));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 3, 3));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 1, 3));
            expectedResult.add(new TKTPDoiBongTheoTranDau(0, 4, 3));

        }
        DoiBong doiBong = new DoiBong();
        doiBong.setId(1);

        List<TKTPDoiBongTheoTranDau> actualResult = TKTPDoiBongTheoTranDauDAO.thongKe(doiBong);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDemSoTheDoDoiBong() {
        JPA.bootstrap(path());
        int expectedResult = 5;

        DoiBong doiBong = new DoiBong();
        doiBong.setId(16);
        int actualResult = TheDoDAO.countTheDoDoiBong(doiBong);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDemSoTheVangDoiBong() {
        int expectedResult = 73;

        DoiBong doiBong = new DoiBong();
        doiBong.setId(16);
        int actualResult = TheVangDAO.countTheVangDoiBong(doiBong);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDemSoLoiDoDoiBong() {
        int expectedResult = 121;

        DoiBong doiBong = new DoiBong();
        doiBong.setId(16);
        int actualResult = LoiDAO.countLoiDoiBong(doiBong);

        assertEquals(expectedResult, actualResult);
    }
}

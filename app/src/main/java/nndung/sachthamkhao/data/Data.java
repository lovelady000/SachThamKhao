package nndung.sachthamkhao.data;

import java.util.ArrayList;

import nndung.sachthamkhao.entity.Lop;
import nndung.sachthamkhao.entity.MonHoc;

/**
 * Created by nndun on 3/6/2017.
 */

public class Data {
    public static ArrayList<Lop> DanhSachLop = new ArrayList<Lop>() {
        {
            add(new Lop(0,"Lớp 10",1) {});
            add(new Lop(1,"Lớp 11",2) {});
            add(new Lop(2,"Lớp 12",3) {});
        }
    };

    public static ArrayList<MonHoc> DanhSachMon = new ArrayList<MonHoc>(){
        {
            add(new MonHoc(0,"Tiếng Anh",1));
            add(new MonHoc(1,"Toán",2));
            add(new MonHoc(2,"Tin học",3));
        }
    };


}

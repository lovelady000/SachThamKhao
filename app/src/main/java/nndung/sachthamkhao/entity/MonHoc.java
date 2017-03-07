package nndung.sachthamkhao.entity;

/**
 * Created by nndun on 3/6/2017.
 */

public class MonHoc {

    private int id;

    public MonHoc(int id, String tenMon, int viTri) {
        this.id = id;
        this.tenMon = tenMon;
        this.viTri = viTri;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getViTri() {
        return viTri;
    }

    public void setViTri(int viTri) {
        this.viTri = viTri;
    }

    private String tenMon;
    private int viTri;
}

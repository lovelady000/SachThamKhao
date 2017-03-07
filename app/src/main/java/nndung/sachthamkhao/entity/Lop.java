package nndung.sachthamkhao.entity;

/**
 * Created by nndun on 3/6/2017.
 */

public class Lop {

    public Lop(int viTri, String tenLop, int id) {
        this.viTri = viTri;
        this.tenLop = tenLop;
        this.id = id;
    }

    private String tenLop;

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public int getViTri() {
        return viTri;
    }

    public void setViTri(int viTri) {
        this.viTri = viTri;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int viTri;
    private int id;
}

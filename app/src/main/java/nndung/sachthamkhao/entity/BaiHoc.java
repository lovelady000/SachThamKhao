package nndung.sachthamkhao.entity;

/**
 * Created by nndun on 3/6/2017.
 */

public class BaiHoc {

    public BaiHoc(int id, String tenBai, String duongDan) {
        this.id = id;
        this.tenBai = tenBai;
        this.duongDan = duongDan;
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenBai() {
        return tenBai;
    }

    public void setTenBai(String tenBai) {
        this.tenBai = tenBai;
    }

    public String getDuongDan() {
        return duongDan;
    }

    public void setDuongDan(String duongDan) {
        this.duongDan = duongDan;
    }

    private String tenBai;
    private String duongDan;
}

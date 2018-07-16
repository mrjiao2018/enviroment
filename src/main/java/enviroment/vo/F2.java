package enviroment.vo;

import enviroment.vo.mpl.Calc;

/**
 * Created by zhong on 2018/7/12 15:39
 */
public class F2 implements Calc {
    private double A;
    private double Bn;
    private double Cy;
    private String type;
    private double Gy;
    private double Uy;


    public Double getA() {
        return A;
    }

    public void setA(Double a) {
        this.A = a;
    }

    public Double getBn() {
        return Bn;
    }

    public void setBn(Double bn) {
        this.Bn = bn;
    }

    public Double getCy() {
        return Cy;
    }

    public void setCy(Double cy) {
        this.Cy = cy;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getGy() {
        return Gy;
    }

    public void setGy(Double gy) {
        this.Gy = gy;
    }

    public Double getUy() {
        return Uy;
    }

    public void setUy(Double uy) {
        this.Uy = uy;
    }



    @Override
    public void cale() {
        Gy =1.19* A * Bn;
        Uy = Gy * Cy;
    }
}

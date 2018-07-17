package enviroment.vo;

import enviroment.vo.mpl.Calc;


/**
 * Created by zhong on 2018/7/13 16:52
 */
public class H4 implements Calc {
    private double Kz;
    private double Qz;
    private double A;
    private double Gz;
    private double Uz;
    private String type;

    public double getKz() {
        return Kz;
    }

    public void setKz(double kz) {
        this.Kz = kz;
    }

    public Double getQz() {
        return Qz;
    }

    public void setQz(Double qz) {
        this.Qz = qz;
    }

    public Double getA() {
        return A;
    }

    public void setA(Double a) {
        this.A = a;
    }

    public Double getGz() {
        return Gz;
    }

    public void setGz(Double gz) {
        this.Gz = gz;
    }

    public Double getUz() {
        return Uz;
    }

    public void setUz(Double uz) {
        this.Uz = uz;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void cale() {
        Gz=Qz*A;
        Uz = A * Kz * Qz;
    }
}

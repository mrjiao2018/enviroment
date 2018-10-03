package enviroment.vo;

import enviroment.vo.mpl.Calc;


/**
 * Created by zhong on 2018/7/13 16:52
 */
public class H1 implements Calc {
    private double A;
    private double H;
    private double Kf;
    private double Qf;
    private double L;
    private double Uf;
    private double Gf;
    private String type;

    public Double getA() {
        return A;
    }

    public void setA(Double a) {
        this.A = a;
    }

    public Double getH() {
        return H;
    }

    public void setH(Double h) {
        this.H = h;
    }

    public Double getKf() {
        return Kf;
    }

    public void setKf(Double kf) {
        this.Kf = kf;
    }

    public Double getQf() {
        return Qf;
    }

    public void setQf(Double qf) {
        this.Qf = qf;
    }

    public Double getL() {
        return L;
    }

    public void setL(Double l) {
        this.L = l;
    }

    public Double getUf() {
        return Uf;
    }

    public void setUf(Double uf) {
        this.Uf = uf;
    }

    public Double getGf() {
        return Gf;
    }

    public void setGf(Double gf) {
        this.Gf = gf;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void cale() {
        Gf =5.256E15* Qf * A * H / L;
        Uf =5.256E15* A * H * Kf *(Qf -600)/ L;

        Format.set2Point(this);
    }
}

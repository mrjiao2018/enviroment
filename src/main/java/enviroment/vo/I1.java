package enviroment.vo;

import enviroment.vo.mpl.Calc;

/**
 * Created by zhong on 2018/7/13 16:52
 */
public class I1 implements Calc {
    private double U;
    private double A;
    private double B;
    private double Uf;
    private double Gf;
    private String type;

    public Double getU() {
        return U;
    }

    public void setU(Double u) {
        this.U = u;
    }

    public Double getA() {
        return A;
    }

    public void setA(Double a) {
        this.A = a;
    }

    public Double getB() {
        return B;
    }

    public void setB(Double b) {
        this.B = b;
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
Uf = U * A * B;
    }
}

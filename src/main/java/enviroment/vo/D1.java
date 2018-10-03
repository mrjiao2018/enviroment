package enviroment.vo;

import enviroment.vo.mpl.Calc;


/**
 * Created by zhong on 2018/7/12 15:38
 */

public class D1 implements Calc {
    private double A;
    private double P;
    private double E;
    private double C;
    private double Ck;
    private String type;
    private double Gt;
    private double Ut;

    public Double getA() {
        return A;
    }

    public void setA(Double a) {
        this.A = a;
    }

    public Double getP() {
        return P;
    }

    public void setP(Double p) {
        this.P = p;
    }

    public Double getE() {
        return E;
    }

    public void setE(Double e) {
        this.E = e;
    }

    public Double getC() {
        return C;
    }

    public void setC(Double c) {
        this.C = c;
    }

    public Double getCk() {
        return Ck;
    }

    public void setCk(Double ck) {
        this.Ck = ck;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getGt() {
        return Gt;
    }

    public void setGt(Double gt) {
        this.Gt = gt;
    }

    public Double getUt() {
        return Ut;
    }

    public void setUt(Double ut) {
        this.Ut = ut;
    }

    @Override
    public void cale() {
        Gt =10* A *(P - E - C);
        Ut =10* Ck * A *(P - E - C);

        Format.set2Point(this);
    }
}

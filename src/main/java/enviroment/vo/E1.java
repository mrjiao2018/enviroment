package enviroment.vo;

import enviroment.vo.mpl.Calc;


/**
 * Created by zhong on 2018/7/12 15:38
 */

public class E1 implements Calc {
    private double A;
    private double X1;
    private double X2;
    private double Ct;
    private double P;
    private double Gt;
    private double Ut;
    private String type;

    public double getA() {
        return A;
    }

    public void setA(double a) {
        A = a;
    }

    public double getX1() {
        return X1;
    }

    public void setX1(double x1) {
        X1 = x1;
    }

    public double getX2() {
        return X2;
    }

    public void setX2(double x2) {
        X2 = x2;
    }

    public double getCt() {
        return Ct;
    }

    public void setCt(double ct) {
        Ct = ct;
    }

    public double getP() {
        return P;
    }

    public void setP(double p) {
        P = p;
    }

    public double getGt() {
        return Gt;
    }

    public void setGt(double gt) {
        Gt = gt;
    }

    public double getUt() {
        return Ut;
    }

    public void setUt(double ut) {
        Ut = ut;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void cale() {
        Gt=A*(X2-X1);
        Ut=A*Ct*(X2-X1)/P;
    }
}

package enviroment.vo;

import enviroment.vo.mpl.Calc;


/**
 * Created by zhong on 2018/7/12 15:38
 */

public class D2 implements Calc {
    private double A;
    private double P;
    private double E;
    private double C;
    private double Ck;
    private String type;
    private double Gt;
    private double Us;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setA(double a) {
        A = a;
    }

    public void setP(double p) {
        P = p;
    }

    public double getE() {
        return E;
    }

    public void setE(double e) {
        E = e;
    }

    public void setC(double c) {
        C = c;
    }

    public void setCk(double ck) {
        this.Ck = ck;
    }

    public double getGt() {
        return Gt;
    }

    public void setGt(double gt) {
        Gt = gt;
    }

    public double getUs() {
        return Us;
    }

    public void setUs(double us) {
        Us = us;
    }

    @Override
    public void cale() {
        Gt =10* A *(P - E - C);
        Us=10* Ck * A *(P - E - C);

        Format.set2Point(this);
    }
}

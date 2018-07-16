package enviroment.vo;

import enviroment.vo.mpl.Calc;


/**
 * Created by zhong on 2018/7/13 16:52
 */
public class H4 implements Calc {
    private double K;
    private double Q;
    private double A;
    private double C;
    private double U;
    private String type;

    public double getK() {
        return K;
    }

    public void setK(double k) {
        this.K = k;
    }

    public Double getQ() {
        return Q;
    }

    public void setQ(Double q) {
        this.Q = q;
    }

    public Double getA() {
        return A;
    }

    public void setA(Double a) {
        this.A = a;
    }

    public Double getC() {
        return C;
    }

    public void setC(Double c) {
        this.C = c;
    }

    public Double getU() {
        return U;
    }

    public void setU(Double u) {
        this.U = u;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void cale() {
        U = A * K * Q;
    }
}

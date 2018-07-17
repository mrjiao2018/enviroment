package enviroment.vo;

import enviroment.vo.mpl.Calc;


/**
 * Created by zhong on 2018/7/12 15:38
 */

public class B2 implements Calc {
    private double A;
    private double B;
    private double C;
    private String type;

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

    public Double getC() {
        return C;
    }

    public void setC(Double c) {
        this.C = c;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void cale() {
        C = A * B;
    }
}

package enviroment.vo;

import enviroment.vo.mpl.Calc;


/**
 * Created by zhong on 2018/7/12 15:38
 */

public class E2 implements Calc {
    private double A;
    private double X1;
    private double X2;
    private double C1;
    private double C2;
    private double C3;
    private double R1;
    private double R2;
    private double R3;
    private double M;
    private double P;
    private double K;
    private double N;
    private double Gf;
    private double Uf;

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getA() {
        return A;
    }

    public void setA(Double a) {
        this.A = a;
    }

    public Double getX1() {
        return X1;
    }

    public void setX1(Double x1) {
        this.X1 = x1;
    }

    public Double getX2() {
        return X2;
    }

    public void setX2(Double x2) {
        this.X2 = x2;
    }

    public Double getC1() {
        return C1;
    }

    public void setC1(Double c1) {
        this.C1 = c1;
    }

    public Double getC2() {
        return C2;
    }

    public void setC2(Double c2) {
        this.C2 = c2;
    }

    public Double getC3() {
        return C3;
    }

    public void setC3(Double c3) {
        this.C3 = c3;
    }

    public Double getR1() {
        return R1;
    }

    public void setR1(Double r1) {
        this.R1 = r1;
    }

    public Double getR2() {
        return R2;
    }

    public void setR2(Double r2) {
        this.R2 = r2;
    }

    public Double getR3() {
        return R3;
    }

    public void setR3(Double r3) {
        this.R3 = r3;
    }

    public Double getM() {
        return M;
    }

    public void setM(Double m) {
        this.M = m;
    }

    public Double getP() {
        return P;
    }

    public void setP(Double p) {
        this.P = p;
    }

    public Double getK() {
        return K;
    }

    public void setK(Double k) {
        this.K = k;
    }

    public Double getN() {
        return N;
    }

    public void setN(Double n) {
        this.N = n;
    }

    public Double getGf() {
        return Gf;
    }

    public void setGf(Double gf) {
        this.Gf = gf;
    }

    public Double getUf() {
        return Uf;
    }

    public void setUf(Double uf) {
        this.Uf = uf;
    }

    @Override
    public void cale() {
        Gf = A *(X2 - X1)*(N * C1 + P * C1 + K * C2 + M * C3);
        Uf = A *(X2 - X1)*(N * C1 / R1 + P * C1 / R2 + K * C2 / R3 + M * C3);

        Format.set4Point(this);
    }
}

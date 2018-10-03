package enviroment.vo;

import enviroment.vo.mpl.Calc;

/**
 * Created by zhong on 2018/7/13 16:52
 */
public class G1 implements Calc {
    private double A;
    private double B;
    private double C1;
    private double C2;
    private double R1;
    private double R2;
    private double R3;
    private double P;
    private double K;
    private double N;
    private double Gk;
    private double Gn;
    private double Gp;
    private double Un;
    private double Uk;
    private double Up;
    private double Uz;
    private String type;

    public void setA(double a) {
        A = a;
    }

    public double getUz() {
        return Uz;
    }

    public void setUz(double uz) {
        Uz = uz;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void cale() {
Gn= A * B * N;
Gp= A * B * P;
Gk= A * B * K;
Un=Gn* C1 / R1;
Uk=Gk* C1 / R2;
Up=Gp* C2 / R3;
Uz=Un+Uk+Up;

        Format.set2Point(this);
    }
}

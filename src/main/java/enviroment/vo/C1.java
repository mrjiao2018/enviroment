package enviroment.vo;

import enviroment.vo.mpl.Calc;


/**
 * Created by zhong on 2018/7/12 15:38
 */

public class C1 implements Calc {
    private double A1;
    private double A2;
    private double A3;
    private double A4;
    private double A5;
    private double A6;
    private double B1;
    private double B2;
    private double B3;
    private double B4;
    private double B5;
    private double B6;
    private double C1;
    private double C2;
    private double C3;
    private double C4;
    private double C5;
    private double C6;
    private double D1;
    private String type;


    public Double getA1() {
        return A1;
    }

    public void setA1(Double a1) {
        this.A1 = a1;
    }


    public Double getA2() {
        return A2;
    }

    public void setA2(Double a2) {
        this.A2 = a2;
    }


    public Double getA3() {
        return A3;
    }

    public void setA3(Double a3) {
        this.A3 = a3;
    }

    public Double getA4() {
        return A4;
    }

    public void setA4(Double a4) {
        this.A4 = a4;
    }

    public Double getA5() {
        return A5;
    }

    public void setA5(Double a5) {
        this.A5 = a5;
    }

    public Double getA6() {
        return A6;
    }

    public void setA6(Double a6) {
        this.A6 = a6;
    }

    public Double getB1() {
        return B1;
    }

    public void setB1(Double b1) {
        this.B1 = b1;
    }

    public Double getB2() {
        return B2;
    }

    public void setB2(Double b2) {
        this.B2 = b2;
    }

    public Double getB3() {
        return B3;
    }

    public void setB3(Double b3) {
        this.B3 = b3;
    }

    public Double getB4() {
        return B4;
    }

    public void setB4(Double b4) {
        this.B4 = b4;
    }

    public Double getB5() {
        return B5;
    }

    public void setB5(Double b5) {
        this.B5 = b5;
    }

    public Double getB6() {
        return B6;
    }

    public void setB6(Double b6) {
        this.B6 = b6;
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

    public Double getC4() {
        return C4;
    }

    public void setC4(Double c4) {
        this.C4 = c4;
    }

    public Double getC5() {
        return C5;
    }

    public void setC5(Double c5) {
        this.C5 = c5;
    }

    public Double getC6() {
        return C6;
    }

    public void setC6(Double c6) {
        this.C6 = c6;
    }

    public Double getD1() {
        return D1;
    }

    public void setD1(Double d1) {
        this.D1 = d1;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void cale() {
        C1 = A1 * B1;
        C2 = A2 * B2;
        C3 = A3 * B3;
        C4 = A4 * B4;
        C5 = A5 * B5;
        C6 = A6 * B6;

        D1 = C1 + C2 + C3 + C4 + C5 + C6;

        Format.set2Point(this);
    }
}

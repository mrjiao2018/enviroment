package enviroment.vo;

import enviroment.vo.mpl.Calc;


/**
 * Created by zhong on 2018/7/12 15:38
 */

public class C1 implements Calc {
    private double A1;
    private double a2;
    private double a3;
    private double a4;
    private double a5;
    private double a6;
    private double b1;
    private double b2;
    private double b3;
    private double b4;
    private double b5;
    private double b6;
    private double c1;
    private double c2;
    private double c3;
    private double c4;
    private double c5;
    private double c6;
    private double d1;
    private String type;


    public Double getA1() {
        return A1;
    }

    public void setA1(Double a1) {
        this.A1 = a1;
    }


    public Double getA2() {
        return a2;
    }

    public void setA2(Double a2) {
        this.a2 = a2;
    }


    public Double getA3() {
        return a3;
    }

    public void setA3(Double a3) {
        this.a3 = a3;
    }

    public Double getA4() {
        return a4;
    }

    public void setA4(Double a4) {
        this.a4 = a4;
    }

    public Double getA5() {
        return a5;
    }

    public void setA5(Double a5) {
        this.a5 = a5;
    }

    public Double getA6() {
        return a6;
    }

    public void setA6(Double a6) {
        this.a6 = a6;
    }

    public Double getB1() {
        return b1;
    }

    public void setB1(Double b1) {
        this.b1 = b1;
    }

    public Double getB2() {
        return b2;
    }

    public void setB2(Double b2) {
        this.b2 = b2;
    }

    public Double getB3() {
        return b3;
    }

    public void setB3(Double b3) {
        this.b3 = b3;
    }

    public Double getB4() {
        return b4;
    }

    public void setB4(Double b4) {
        this.b4 = b4;
    }

    public Double getB5() {
        return b5;
    }

    public void setB5(Double b5) {
        this.b5 = b5;
    }

    public Double getB6() {
        return b6;
    }

    public void setB6(Double b6) {
        this.b6 = b6;
    }

    public Double getC1() {
        return c1;
    }

    public void setC1(Double c1) {
        this.c1 = c1;
    }

    public Double getC2() {
        return c2;
    }

    public void setC2(Double c2) {
        this.c2 = c2;
    }

    public Double getC3() {
        return c3;
    }

    public void setC3(Double c3) {
        this.c3 = c3;
    }

    public Double getC4() {
        return c4;
    }

    public void setC4(Double c4) {
        this.c4 = c4;
    }

    public Double getC5() {
        return c5;
    }

    public void setC5(Double c5) {
        this.c5 = c5;
    }

    public Double getC6() {
        return c6;
    }

    public void setC6(Double c6) {
        this.c6 = c6;
    }

    public Double getD1() {
        return d1;
    }

    public void setD1(Double d1) {
        this.d1 = d1;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void cale() {
        c1= A1 *b1;
        c2=a2*b2;
        c3=a3*b3;
        c4=a4*b4;
        c5=a5*b5;
        c6=a6*b6;

        d1=c1+c2+c3+c4+c5+c6;
    }
}

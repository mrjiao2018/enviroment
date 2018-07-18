package enviroment.vo;

import enviroment.vo.mpl.Calc;

public class A1 implements Calc{
    private double A1;
    private double B1;
    private double C1;
    private double A2;
    private double B2;
    private double C2;
    private double A3;
    private double B3;
    private double C3;
    private double A4;
    private double B4;
    private double C4;
    private double A5;
    private double B5;
    private double C5;
    private double A6;
    private double B6;
    private double C6;
    private double A7;
    private double B7;
    private double C7;
    private double A8;
    private double B8;
    private double C8;

    private double D1;
    private double D2;

    private String type;


    @Override
    public void cale() {
        C1=A1*B1;
        C2=A2*B2;
        C3=A3*B3;
        C4=A4*B4;
        C5=A5*B5;
        C6=A6*B6;
        C7=A7*B7;
        C8=A8*B8;

        D1=B1+B2+B3+B4+B5+B6+B7+B8;
        D2=C1+C2+C3+C4+C5+C6+C7+C8;
    }

    public double getA1() {
        return A1;
    }

    public void setA1(double a1) {
        A1 = a1;
    }

    public double getD1() {
        return D1;
    }

    public void setD1(double d1) {
        D1 = d1;
    }

    public double getD2() {
        return D2;
    }

    public void setD2(double d2) {
        D2 = d2;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getB1() {
        return B1;
    }

    public void setB1(double b1) {
        B1 = b1;
    }

    public double getC1() {
        return C1;
    }

    public void setC1(double c1) {
        C1 = c1;
    }

    public double getA2() {
        return A2;
    }

    public void setA2(double a2) {
        A2 = a2;
    }

    public double getB2() {
        return B2;
    }

    public void setB2(double b2) {
        B2 = b2;
    }

    public double getC2() {
        return C2;
    }

    public void setC2(double c2) {
        C2 = c2;
    }

    public double getA3() {
        return A3;
    }

    public void setA3(double a3) {
        A3 = a3;
    }

    public double getB3() {
        return B3;
    }

    public void setB3(double b3) {
        B3 = b3;
    }

    public double getC3() {
        return C3;
    }

    public void setC3(double c3) {
        C3 = c3;
    }

    public double getA4() {
        return A4;
    }

    public void setA4(double a4) {
        A4 = a4;
    }

    public double getB4() {
        return B4;
    }

    public void setB4(double b4) {
        B4 = b4;
    }

    public double getC4() {
        return C4;
    }

    public void setC4(double c4) {
        C4 = c4;
    }

    public double getA5() {
        return A5;
    }

    public void setA5(double a5) {
        A5 = a5;
    }

    public double getB5() {
        return B5;
    }

    public void setB5(double b5) {
        B5 = b5;
    }

    public double getC5() {
        return C5;
    }

    public void setC5(double c5) {
        C5 = c5;
    }

    public double getA6() {
        return A6;
    }

    public void setA6(double a6) {
        A6 = a6;
    }

    public double getB6() {
        return B6;
    }

    public void setB6(double b6) {
        B6 = b6;
    }

    public double getC6() {
        return C6;
    }

    public void setC6(double c6) {
        C6 = c6;
    }

    public double getA7() {
        return A7;
    }

    public void setA7(double a7) {
        A7 = a7;
    }

    public double getB7() {
        return B7;
    }

    public void setB7(double b7) {
        B7 = b7;
    }

    public double getC7() {
        return C7;
    }

    public void setC7(double c7) {
        C7 = c7;
    }

    public double getA8() {
        return A8;
    }

    public void setA8(double a8) {
        A8 = a8;
    }

    public double getB8() {
        return B8;
    }

    public void setB8(double b8) {
        B8 = b8;
    }

    public double getC8() {
        return C8;
    }

    public void setC8(double c8) {
        C8 = c8;
    }
}

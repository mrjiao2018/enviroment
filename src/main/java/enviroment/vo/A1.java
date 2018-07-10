package enviroment.vo;

import enviroment.vo.mpl.Calc;

public class A1 implements Calc{
    private double A1;
    private double A2;
    private double A3;
    private double A4;
    private double A5;
    private double A6;
    private double A7;
    private double A8;
    private double A9;
    private double B1;
    private double B2;
    private double B3;
    private double B4;
    private double B5;
    private double B6;
    private double B7;
    private double B8;
    private double B9;
    private double C1;
    private double C2;
    private double C3;
    private double C4;
    private double C5;
    private double C6;
    private double C7;
    private double C8;
    private double C9;
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
        C9=A9*B9;

        D1=B1+B2+B3+B4+B5+B6+B7+B8+B9;
        D2=C1+C2+C3+C4+C5+C6+C7+C8+C9;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

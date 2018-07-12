package enviroment.vo;

import enviroment.vo.mpl.Calc;


/**
 * Created by zhong on 2018/7/12 15:38
 */

public class C1 implements Calc {
    private Double a1;
    private Double a2;
    private Double a3;
    private Double a4;
    private Double a5;
    private Double a6;
    private Double b1;
    private Double b2;
    private Double b3;
    private Double b4;
    private Double b5;
    private Double b6;
    private Double c1;
    private Double c2;
    private Double c3;
    private Double c4;
    private Double c5;
    private Double c6;
    private Double d1;
    private String type;


    public Double getA1() {
        return a1;
    }

    public void setA1(Double a1) {
        this.a1 = a1;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        C1 c11 = (C1) o;

        if (a1 != null ? !a1.equals(c11.a1) : c11.a1 != null) return false;
        if (a2 != null ? !a2.equals(c11.a2) : c11.a2 != null) return false;
        if (a3 != null ? !a3.equals(c11.a3) : c11.a3 != null) return false;
        if (a4 != null ? !a4.equals(c11.a4) : c11.a4 != null) return false;
        if (a5 != null ? !a5.equals(c11.a5) : c11.a5 != null) return false;
        if (a6 != null ? !a6.equals(c11.a6) : c11.a6 != null) return false;
        if (b1 != null ? !b1.equals(c11.b1) : c11.b1 != null) return false;
        if (b2 != null ? !b2.equals(c11.b2) : c11.b2 != null) return false;
        if (b3 != null ? !b3.equals(c11.b3) : c11.b3 != null) return false;
        if (b4 != null ? !b4.equals(c11.b4) : c11.b4 != null) return false;
        if (b5 != null ? !b5.equals(c11.b5) : c11.b5 != null) return false;
        if (b6 != null ? !b6.equals(c11.b6) : c11.b6 != null) return false;
        if (c1 != null ? !c1.equals(c11.c1) : c11.c1 != null) return false;
        if (c2 != null ? !c2.equals(c11.c2) : c11.c2 != null) return false;
        if (c3 != null ? !c3.equals(c11.c3) : c11.c3 != null) return false;
        if (c4 != null ? !c4.equals(c11.c4) : c11.c4 != null) return false;
        if (c5 != null ? !c5.equals(c11.c5) : c11.c5 != null) return false;
        if (c6 != null ? !c6.equals(c11.c6) : c11.c6 != null) return false;
        if (d1 != null ? !d1.equals(c11.d1) : c11.d1 != null) return false;
        if (type != null ? !type.equals(c11.type) : c11.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a1 != null ? a1.hashCode() : 0;
        result = 31 * result + (a2 != null ? a2.hashCode() : 0);
        result = 31 * result + (a3 != null ? a3.hashCode() : 0);
        result = 31 * result + (a4 != null ? a4.hashCode() : 0);
        result = 31 * result + (a5 != null ? a5.hashCode() : 0);
        result = 31 * result + (a6 != null ? a6.hashCode() : 0);
        result = 31 * result + (b1 != null ? b1.hashCode() : 0);
        result = 31 * result + (b2 != null ? b2.hashCode() : 0);
        result = 31 * result + (b3 != null ? b3.hashCode() : 0);
        result = 31 * result + (b4 != null ? b4.hashCode() : 0);
        result = 31 * result + (b5 != null ? b5.hashCode() : 0);
        result = 31 * result + (b6 != null ? b6.hashCode() : 0);
        result = 31 * result + (c1 != null ? c1.hashCode() : 0);
        result = 31 * result + (c2 != null ? c2.hashCode() : 0);
        result = 31 * result + (c3 != null ? c3.hashCode() : 0);
        result = 31 * result + (c4 != null ? c4.hashCode() : 0);
        result = 31 * result + (c5 != null ? c5.hashCode() : 0);
        result = 31 * result + (c6 != null ? c6.hashCode() : 0);
        result = 31 * result + (d1 != null ? d1.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public void cale() {

    }
}

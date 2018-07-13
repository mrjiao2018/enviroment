package enviroment.vo;

import enviroment.vo.mpl.Calc;


/**
 * Created by zhong on 2018/7/12 15:38
 */

public class E1 implements Calc {
    private Double a;
    private Double x1;
    private Double x2;
    private Double ct;
    private Double p;
    private Double gt;
    private Double ut;
    private String type;

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getX1() {
        return x1;
    }

    public void setX1(Double x1) {
        this.x1 = x1;
    }

    public Double getX2() {
        return x2;
    }

    public void setX2(Double x2) {
        this.x2 = x2;
    }

    public Double getCt() {
        return ct;
    }

    public void setCt(Double ct) {
        this.ct = ct;
    }

    public Double getP() {
        return p;
    }

    public void setP(Double p) {
        this.p = p;
    }

    public Double getGt() {
        return gt;
    }

    public void setGt(Double gt) {
        this.gt = gt;
    }

    public Double getUt() {
        return ut;
    }

    public void setUt(Double ut) {
        this.ut = ut;
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

        E1 e1 = (E1) o;

        if (a != null ? !a.equals(e1.a) : e1.a != null) return false;
        if (x1 != null ? !x1.equals(e1.x1) : e1.x1 != null) return false;
        if (x2 != null ? !x2.equals(e1.x2) : e1.x2 != null) return false;
        if (ct != null ? !ct.equals(e1.ct) : e1.ct != null) return false;
        if (p != null ? !p.equals(e1.p) : e1.p != null) return false;
        if (gt != null ? !gt.equals(e1.gt) : e1.gt != null) return false;
        if (ut != null ? !ut.equals(e1.ut) : e1.ut != null) return false;
        if (type != null ? !type.equals(e1.type) : e1.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a != null ? a.hashCode() : 0;
        result = 31 * result + (x1 != null ? x1.hashCode() : 0);
        result = 31 * result + (x2 != null ? x2.hashCode() : 0);
        result = 31 * result + (ct != null ? ct.hashCode() : 0);
        result = 31 * result + (p != null ? p.hashCode() : 0);
        result = 31 * result + (gt != null ? gt.hashCode() : 0);
        result = 31 * result + (ut != null ? ut.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public void cale() {
        gt=a*(x2-x1);
        ut=a*ct*(x2-x1)/p;
    }
}

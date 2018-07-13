package enviroment.vo;

import enviroment.vo.mpl.Calc;


/**
 * Created by zhong on 2018/7/12 15:38
 */

public class D2 implements Calc {
    private Double a;
    private Double p;
    private Double e;
    private Double c;
    private Double k;
    private String type;
    private Double gt;
    private Double us;

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getP() {
        return p;
    }

    public void setP(Double p) {
        this.p = p;
    }

    public Double getE() {
        return e;
    }

    public void setE(Double e) {
        this.e = e;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    public Double getK() {
        return k;
    }

    public void setK(Double k) {
        this.k = k;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getGt() {
        return gt;
    }

    public void setGt(Double gt) {
        this.gt = gt;
    }

    public Double getUs() {
        return us;
    }

    public void setUs(Double us) {
        this.us = us;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D2 d2 = (D2) o;

        if (a != null ? !a.equals(d2.a) : d2.a != null) return false;
        if (p != null ? !p.equals(d2.p) : d2.p != null) return false;
        if (e != null ? !e.equals(d2.e) : d2.e != null) return false;
        if (c != null ? !c.equals(d2.c) : d2.c != null) return false;
        if (k != null ? !k.equals(d2.k) : d2.k != null) return false;
        if (type != null ? !type.equals(d2.type) : d2.type != null) return false;
        if (gt != null ? !gt.equals(d2.gt) : d2.gt != null) return false;
        if (us != null ? !us.equals(d2.us) : d2.us != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a != null ? a.hashCode() : 0;
        result = 31 * result + (p != null ? p.hashCode() : 0);
        result = 31 * result + (e != null ? e.hashCode() : 0);
        result = 31 * result + (c != null ? c.hashCode() : 0);
        result = 31 * result + (k != null ? k.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (gt != null ? gt.hashCode() : 0);
        result = 31 * result + (us != null ? us.hashCode() : 0);
        return result;
    }

    @Override
    public void cale() {
        gt =10*a*(p-e-c);
        us=10*k*a*(p-e-c);
    }
}

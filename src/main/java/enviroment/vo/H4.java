package enviroment.vo;

import enviroment.vo.mpl.Calc;


/**
 * Created by zhong on 2018/7/13 16:52
 */
public class H4 implements Calc {
    private double k;
    private Double q;
    private Double a;
    private Double c;
    private Double u;
    private String type;

    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }

    public Double getQ() {
        return q;
    }

    public void setQ(Double q) {
        this.q = q;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    public Double getU() {
        return u;
    }

    public void setU(Double u) {
        this.u = u;
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

        H4 h4 = (H4) o;

        if (Double.compare(h4.k, k) != 0) return false;
        if (q != null ? !q.equals(h4.q) : h4.q != null) return false;
        if (a != null ? !a.equals(h4.a) : h4.a != null) return false;
        if (c != null ? !c.equals(h4.c) : h4.c != null) return false;
        if (u != null ? !u.equals(h4.u) : h4.u != null) return false;
        if (type != null ? !type.equals(h4.type) : h4.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(k);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (q != null ? q.hashCode() : 0);
        result = 31 * result + (a != null ? a.hashCode() : 0);
        result = 31 * result + (c != null ? c.hashCode() : 0);
        result = 31 * result + (u != null ? u.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public void cale() {
        u=a*k*q;
    }
}

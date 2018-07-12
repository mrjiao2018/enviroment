package enviroment.vo;

import enviroment.vo.mpl.Calc;


/**
 * Created by zhong on 2018/7/12 15:38
 */

public class E2 implements Calc {
    private Double a;
    private Double x1;
    private Double x2;
    private Double c1;
    private Double c2;
    private Double c3;
    private Double r1;
    private Double r2;
    private Double r3;
    private Double m;
    private Double p;
    private Double k;
    private Double n;
    private Double gf;
    private Double uf;

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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

    public Double getR1() {
        return r1;
    }

    public void setR1(Double r1) {
        this.r1 = r1;
    }

    public Double getR2() {
        return r2;
    }

    public void setR2(Double r2) {
        this.r2 = r2;
    }

    public Double getR3() {
        return r3;
    }

    public void setR3(Double r3) {
        this.r3 = r3;
    }

    public Double getM() {
        return m;
    }

    public void setM(Double m) {
        this.m = m;
    }

    public Double getP() {
        return p;
    }

    public void setP(Double p) {
        this.p = p;
    }

    public Double getK() {
        return k;
    }

    public void setK(Double k) {
        this.k = k;
    }

    public Double getN() {
        return n;
    }

    public void setN(Double n) {
        this.n = n;
    }

    public Double getGf() {
        return gf;
    }

    public void setGf(Double gf) {
        this.gf = gf;
    }

    public Double getUf() {
        return uf;
    }

    public void setUf(Double uf) {
        this.uf = uf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E2 e2 = (E2) o;

        if (a != null ? !a.equals(e2.a) : e2.a != null) return false;
        if (x1 != null ? !x1.equals(e2.x1) : e2.x1 != null) return false;
        if (x2 != null ? !x2.equals(e2.x2) : e2.x2 != null) return false;
        if (c1 != null ? !c1.equals(e2.c1) : e2.c1 != null) return false;
        if (c2 != null ? !c2.equals(e2.c2) : e2.c2 != null) return false;
        if (c3 != null ? !c3.equals(e2.c3) : e2.c3 != null) return false;
        if (r1 != null ? !r1.equals(e2.r1) : e2.r1 != null) return false;
        if (r2 != null ? !r2.equals(e2.r2) : e2.r2 != null) return false;
        if (r3 != null ? !r3.equals(e2.r3) : e2.r3 != null) return false;
        if (m != null ? !m.equals(e2.m) : e2.m != null) return false;
        if (p != null ? !p.equals(e2.p) : e2.p != null) return false;
        if (k != null ? !k.equals(e2.k) : e2.k != null) return false;
        if (n != null ? !n.equals(e2.n) : e2.n != null) return false;
        if (gf != null ? !gf.equals(e2.gf) : e2.gf != null) return false;
        if (uf != null ? !uf.equals(e2.uf) : e2.uf != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a != null ? a.hashCode() : 0;
        result = 31 * result + (x1 != null ? x1.hashCode() : 0);
        result = 31 * result + (x2 != null ? x2.hashCode() : 0);
        result = 31 * result + (c1 != null ? c1.hashCode() : 0);
        result = 31 * result + (c2 != null ? c2.hashCode() : 0);
        result = 31 * result + (c3 != null ? c3.hashCode() : 0);
        result = 31 * result + (r1 != null ? r1.hashCode() : 0);
        result = 31 * result + (r2 != null ? r2.hashCode() : 0);
        result = 31 * result + (r3 != null ? r3.hashCode() : 0);
        result = 31 * result + (m != null ? m.hashCode() : 0);
        result = 31 * result + (p != null ? p.hashCode() : 0);
        result = 31 * result + (k != null ? k.hashCode() : 0);
        result = 31 * result + (n != null ? n.hashCode() : 0);
        result = 31 * result + (gf != null ? gf.hashCode() : 0);
        result = 31 * result + (uf != null ? uf.hashCode() : 0);
        return result;
    }

    @Override
    public void cale() {

    }
}

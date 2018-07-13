package enviroment.vo;

import enviroment.vo.mpl.Calc;

/**
 * Created by zhong on 2018/7/13 16:52
 */
public class G1 implements Calc {
    private Double a;
    private Double b;
    private Double c1;
    private Double c2;
    private Double r1;
    private Double r2;
    private Double r3;
    private Double p;
    private Double k;
    private Double n;
    private Double Gk;
    private Double Gn;
    private Double Gp;
    private Double Un;
    private Double Uk;
    private Double Up;
    private String type;

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
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

        G1 g1 = (G1) o;

        if (a != null ? !a.equals(g1.a) : g1.a != null) return false;
        if (b != null ? !b.equals(g1.b) : g1.b != null) return false;
        if (c1 != null ? !c1.equals(g1.c1) : g1.c1 != null) return false;
        if (c2 != null ? !c2.equals(g1.c2) : g1.c2 != null) return false;
        if (r1 != null ? !r1.equals(g1.r1) : g1.r1 != null) return false;
        if (r2 != null ? !r2.equals(g1.r2) : g1.r2 != null) return false;
        if (r3 != null ? !r3.equals(g1.r3) : g1.r3 != null) return false;
        if (p != null ? !p.equals(g1.p) : g1.p != null) return false;
        if (k != null ? !k.equals(g1.k) : g1.k != null) return false;
        if (n != null ? !n.equals(g1.n) : g1.n != null) return false;
        if (type != null ? !type.equals(g1.type) : g1.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a != null ? a.hashCode() : 0;
        result = 31 * result + (b != null ? b.hashCode() : 0);
        result = 31 * result + (c1 != null ? c1.hashCode() : 0);
        result = 31 * result + (c2 != null ? c2.hashCode() : 0);
        result = 31 * result + (r1 != null ? r1.hashCode() : 0);
        result = 31 * result + (r2 != null ? r2.hashCode() : 0);
        result = 31 * result + (r3 != null ? r3.hashCode() : 0);
        result = 31 * result + (p != null ? p.hashCode() : 0);
        result = 31 * result + (k != null ? k.hashCode() : 0);
        result = 31 * result + (n != null ? n.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public void cale() {
Gn=a*b*n;
Gp=a*b*p;
Gk=a*b*k;
Un=Gn*c1/r1;
Uk=Gk*c1/r2;
Up=Gp*c2/r3;
    }
}

package enviroment.vo;

import enviroment.vo.mpl.Calc;

/**
 * Created by zhong on 2018/7/13 16:52
 */
public class I1 implements Calc {
    private Double u;
    private Double a;
    private Double b;
    private Double uf;
    private Double gf;
    private String type;

    public Double getU() {
        return u;
    }

    public void setU(Double u) {
        this.u = u;
    }

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

    public Double getUf() {
        return uf;
    }

    public void setUf(Double uf) {
        this.uf = uf;
    }

    public Double getGf() {
        return gf;
    }

    public void setGf(Double gf) {
        this.gf = gf;
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

        I1 i1 = (I1) o;

        if (u != null ? !u.equals(i1.u) : i1.u != null) return false;
        if (a != null ? !a.equals(i1.a) : i1.a != null) return false;
        if (b != null ? !b.equals(i1.b) : i1.b != null) return false;
        if (uf != null ? !uf.equals(i1.uf) : i1.uf != null) return false;
        if (gf != null ? !gf.equals(i1.gf) : i1.gf != null) return false;
        if (type != null ? !type.equals(i1.type) : i1.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = u != null ? u.hashCode() : 0;
        result = 31 * result + (a != null ? a.hashCode() : 0);
        result = 31 * result + (b != null ? b.hashCode() : 0);
        result = 31 * result + (uf != null ? uf.hashCode() : 0);
        result = 31 * result + (gf != null ? gf.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public void cale() {
uf=u*a*b;
    }
}

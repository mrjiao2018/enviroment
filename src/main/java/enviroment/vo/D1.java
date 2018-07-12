package enviroment.vo;

import enviroment.vo.mpl.Calc;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zhong on 2018/7/12 15:38
 */

public class D1 implements Calc {
    private Double a;
    private Double p;
    private Double e;
    private Double c;
    private Double ck;
    private String type;
    private Double gt;
    private Double ut;

    @Basic
    @Column(name = "A", nullable = true, precision = 0)
    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    @Basic
    @Column(name = "P", nullable = true, precision = 0)
    public Double getP() {
        return p;
    }

    public void setP(Double p) {
        this.p = p;
    }

    @Basic
    @Column(name = "E", nullable = true, precision = 0)
    public Double getE() {
        return e;
    }

    public void setE(Double e) {
        this.e = e;
    }

    @Basic
    @Column(name = "C", nullable = true, precision = 0)
    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    @Basic
    @Column(name = "Ck", nullable = true, precision = 0)
    public Double getCk() {
        return ck;
    }

    public void setCk(Double ck) {
        this.ck = ck;
    }

    @Basic
    @Column(name = "type", nullable = true, length = 45)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "Gt", nullable = true, precision = 0)
    public Double getGt() {
        return gt;
    }

    public void setGt(Double gt) {
        this.gt = gt;
    }

    @Basic
    @Column(name = "Ut", nullable = true, precision = 0)
    public Double getUt() {
        return ut;
    }

    public void setUt(Double ut) {
        this.ut = ut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        D1 d1 = (D1) o;

        if (a != null ? !a.equals(d1.a) : d1.a != null) return false;
        if (p != null ? !p.equals(d1.p) : d1.p != null) return false;
        if (e != null ? !e.equals(d1.e) : d1.e != null) return false;
        if (c != null ? !c.equals(d1.c) : d1.c != null) return false;
        if (ck != null ? !ck.equals(d1.ck) : d1.ck != null) return false;
        if (type != null ? !type.equals(d1.type) : d1.type != null) return false;
        if (gt != null ? !gt.equals(d1.gt) : d1.gt != null) return false;
        if (ut != null ? !ut.equals(d1.ut) : d1.ut != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a != null ? a.hashCode() : 0;
        result = 31 * result + (p != null ? p.hashCode() : 0);
        result = 31 * result + (e != null ? e.hashCode() : 0);
        result = 31 * result + (c != null ? c.hashCode() : 0);
        result = 31 * result + (ck != null ? ck.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (gt != null ? gt.hashCode() : 0);
        result = 31 * result + (ut != null ? ut.hashCode() : 0);
        return result;
    }

    @Override
    public void cale() {

    }
}

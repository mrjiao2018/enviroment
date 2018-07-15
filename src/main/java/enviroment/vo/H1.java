package enviroment.vo;

import enviroment.vo.mpl.Calc;


/**
 * Created by zhong on 2018/7/13 16:52
 */
public class H1 implements Calc {
    private Double a;
    private Double h;
    private Double kf;
    private Double qf;
    private Double l;
    private Double uf;
    private Double gf;
    private String type;

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getH() {
        return h;
    }

    public void setH(Double h) {
        this.h = h;
    }

    public Double getKf() {
        return kf;
    }

    public void setKf(Double kf) {
        this.kf = kf;
    }

    public Double getQf() {
        return qf;
    }

    public void setQf(Double qf) {
        this.qf = qf;
    }

    public Double getL() {
        return l;
    }

    public void setL(Double l) {
        this.l = l;
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

        H1 h1 = (H1) o;

        if (a != null ? !a.equals(h1.a) : h1.a != null) return false;
        if (h != null ? !h.equals(h1.h) : h1.h != null) return false;
        if (kf != null ? !kf.equals(h1.kf) : h1.kf != null) return false;
        if (qf != null ? !qf.equals(h1.qf) : h1.qf != null) return false;
        if (l != null ? !l.equals(h1.l) : h1.l != null) return false;
        if (uf != null ? !uf.equals(h1.uf) : h1.uf != null) return false;
        if (gf != null ? !gf.equals(h1.gf) : h1.gf != null) return false;
        if (type != null ? !type.equals(h1.type) : h1.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a != null ? a.hashCode() : 0;
        result = 31 * result + (h != null ? h.hashCode() : 0);
        result = 31 * result + (kf != null ? kf.hashCode() : 0);
        result = 31 * result + (qf != null ? qf.hashCode() : 0);
        result = 31 * result + (l != null ? l.hashCode() : 0);
        result = 31 * result + (uf != null ? uf.hashCode() : 0);
        result = 31 * result + (gf != null ? gf.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public void cale() {
        gf=5.256E15*qf*a*h/l;
        uf=5.256E15*a*h*kf*(qf-600)/l;
    }
}

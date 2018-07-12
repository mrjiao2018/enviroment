package enviroment.vo;

import enviroment.vo.mpl.Calc;

import javax.persistence.Basic;
import javax.persistence.Cache;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zhong on 2018/7/12 15:39
 */
public class F1 implements Calc {
    private Double a;
    private Double ct;
    private Double rt;
    private Double bn;
    private Double ft;
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
    @Column(name = "Ct", nullable = true, precision = 0)
    public Double getCt() {
        return ct;
    }

    public void setCt(Double ct) {
        this.ct = ct;
    }

    @Basic
    @Column(name = "Rt", nullable = true, precision = 0)
    public Double getRt() {
        return rt;
    }

    public void setRt(Double rt) {
        this.rt = rt;
    }

    @Basic
    @Column(name = "Bn", nullable = true, precision = 0)
    public Double getBn() {
        return bn;
    }

    public void setBn(Double bn) {
        this.bn = bn;
    }

    @Basic
    @Column(name = "Ft", nullable = true, precision = 0)
    public Double getFt() {
        return ft;
    }

    public void setFt(Double ft) {
        this.ft = ft;
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

        F1 f1 = (F1) o;

        if (a != null ? !a.equals(f1.a) : f1.a != null) return false;
        if (ct != null ? !ct.equals(f1.ct) : f1.ct != null) return false;
        if (rt != null ? !rt.equals(f1.rt) : f1.rt != null) return false;
        if (bn != null ? !bn.equals(f1.bn) : f1.bn != null) return false;
        if (ft != null ? !ft.equals(f1.ft) : f1.ft != null) return false;
        if (type != null ? !type.equals(f1.type) : f1.type != null) return false;
        if (gt != null ? !gt.equals(f1.gt) : f1.gt != null) return false;
        if (ut != null ? !ut.equals(f1.ut) : f1.ut != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a != null ? a.hashCode() : 0;
        result = 31 * result + (ct != null ? ct.hashCode() : 0);
        result = 31 * result + (rt != null ? rt.hashCode() : 0);
        result = 31 * result + (bn != null ? bn.hashCode() : 0);
        result = 31 * result + (ft != null ? ft.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (gt != null ? gt.hashCode() : 0);
        result = 31 * result + (ut != null ? ut.hashCode() : 0);
        return result;
    }

    @Override
    public void cale() {

    }
}

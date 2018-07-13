package enviroment.vo;

import enviroment.vo.mpl.Calc;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zhong on 2018/7/13 16:52
 */
public class H2 implements Calc {
    private Double a;
    private Double ke;
    private Double qe;
    private Double kd;
    private Double qd;
    private Double kf;
    private Double qf;
    private String type;

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getKe() {
        return ke;
    }

    public void setKe(Double ke) {
        this.ke = ke;
    }

    public Double getQe() {
        return qe;
    }

    public void setQe(Double qe) {
        this.qe = qe;
    }

    public Double getKd() {
        return kd;
    }

    public void setKd(Double kd) {
        this.kd = kd;
    }

    public Double getQd() {
        return qd;
    }

    public void setQd(Double qd) {
        this.qd = qd;
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

        H2 h2 = (H2) o;

        if (a != null ? !a.equals(h2.a) : h2.a != null) return false;
        if (ke != null ? !ke.equals(h2.ke) : h2.ke != null) return false;
        if (qe != null ? !qe.equals(h2.qe) : h2.qe != null) return false;
        if (kd != null ? !kd.equals(h2.kd) : h2.kd != null) return false;
        if (qd != null ? !qd.equals(h2.qd) : h2.qd != null) return false;
        if (kf != null ? !kf.equals(h2.kf) : h2.kf != null) return false;
        if (qf != null ? !qf.equals(h2.qf) : h2.qf != null) return false;
        if (type != null ? !type.equals(h2.type) : h2.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a != null ? a.hashCode() : 0;
        result = 31 * result + (ke != null ? ke.hashCode() : 0);
        result = 31 * result + (qe != null ? qe.hashCode() : 0);
        result = 31 * result + (kd != null ? kd.hashCode() : 0);
        result = 31 * result + (qd != null ? qd.hashCode() : 0);
        result = 31 * result + (kf != null ? kf.hashCode() : 0);
        result = 31 * result + (qf != null ? qf.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public void cale() {

    }
}

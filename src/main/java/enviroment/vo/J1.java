package enviroment.vo;

import enviroment.vo.mpl.Calc;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zhong on 2018/7/13 16:52
 */
public class J1 implements Calc {
    private Double s;
    private Double a;
    private Double us;
    private String type;

    public Double getS() {
        return s;
    }

    public void setS(Double s) {
        this.s = s;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getUs() {
        return us;
    }

    public void setUs(Double us) {
        this.us = us;
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

        J1 j1 = (J1) o;

        if (s != null ? !s.equals(j1.s) : j1.s != null) return false;
        if (a != null ? !a.equals(j1.a) : j1.a != null) return false;
        if (us != null ? !us.equals(j1.us) : j1.us != null) return false;
        if (type != null ? !type.equals(j1.type) : j1.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = s != null ? s.hashCode() : 0;
        result = 31 * result + (a != null ? a.hashCode() : 0);
        result = 31 * result + (us != null ? us.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public void cale() {
us=s*a;
    }
}

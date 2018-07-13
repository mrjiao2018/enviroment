package enviroment.vo;

import enviroment.vo.mpl.Calc;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zhong on 2018/7/13 16:52
 */
public class H3 implements Calc {
    private Double a2;
    private Double k2;
    private Double u2;
    private String type;

    public Double getA2() {
        return a2;
    }

    public void setA2(Double a2) {
        this.a2 = a2;
    }

    public Double getK2() {
        return k2;
    }

    public void setK2(Double k2) {
        this.k2 = k2;
    }

    public Double getU2() {
        return u2;
    }

    public void setU2(Double u2) {
        this.u2 = u2;
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

        H3 h3 = (H3) o;

        if (a2 != null ? !a2.equals(h3.a2) : h3.a2 != null) return false;
        if (k2 != null ? !k2.equals(h3.k2) : h3.k2 != null) return false;
        if (u2 != null ? !u2.equals(h3.u2) : h3.u2 != null) return false;
        if (type != null ? !type.equals(h3.type) : h3.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a2 != null ? a2.hashCode() : 0;
        result = 31 * result + (k2 != null ? k2.hashCode() : 0);
        result = 31 * result + (u2 != null ? u2.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public void cale() {
u2=k2*a2;
    }
}

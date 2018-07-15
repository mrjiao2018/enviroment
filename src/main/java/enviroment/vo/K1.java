package enviroment.vo;

import enviroment.vo.mpl.Calc;


/**
 * Created by zhong on 2018/7/13 16:52
 */
public class K1 implements Calc {
    private Double u;
    private Double a;
    private Double us;
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

        K1 k1 = (K1) o;

        if (u != null ? !u.equals(k1.u) : k1.u != null) return false;
        if (a != null ? !a.equals(k1.a) : k1.a != null) return false;
        if (us != null ? !us.equals(k1.us) : k1.us != null) return false;
        if (type != null ? !type.equals(k1.type) : k1.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = u != null ? u.hashCode() : 0;
        result = 31 * result + (a != null ? a.hashCode() : 0);
        result = 31 * result + (us != null ? us.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public void cale() {
        us=u*a;
    }
}

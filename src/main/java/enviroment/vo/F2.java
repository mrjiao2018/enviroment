package enviroment.vo;

import enviroment.vo.mpl.Calc;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zhong on 2018/7/12 15:39
 */
public class F2 implements Calc {
    private Double a;
    private Double bn;
    private Double cy;
    private String type;
    private Double gy;
    private Double uy;

    @Basic
    @Column(name = "A", nullable = true, precision = 0)
    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
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
    @Column(name = "Cy", nullable = true, precision = 0)
    public Double getCy() {
        return cy;
    }

    public void setCy(Double cy) {
        this.cy = cy;
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
    @Column(name = "Gy", nullable = true, precision = 0)
    public Double getGy() {
        return gy;
    }

    public void setGy(Double gy) {
        this.gy = gy;
    }

    @Basic
    @Column(name = "Uy", nullable = true, precision = 0)
    public Double getUy() {
        return uy;
    }

    public void setUy(Double uy) {
        this.uy = uy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        F2 f2 = (F2) o;

        if (a != null ? !a.equals(f2.a) : f2.a != null) return false;
        if (bn != null ? !bn.equals(f2.bn) : f2.bn != null) return false;
        if (cy != null ? !cy.equals(f2.cy) : f2.cy != null) return false;
        if (type != null ? !type.equals(f2.type) : f2.type != null) return false;
        if (gy != null ? !gy.equals(f2.gy) : f2.gy != null) return false;
        if (uy != null ? !uy.equals(f2.uy) : f2.uy != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a != null ? a.hashCode() : 0;
        result = 31 * result + (bn != null ? bn.hashCode() : 0);
        result = 31 * result + (cy != null ? cy.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (gy != null ? gy.hashCode() : 0);
        result = 31 * result + (uy != null ? uy.hashCode() : 0);
        return result;
    }

    @Override
    public void cale() {

    }
}

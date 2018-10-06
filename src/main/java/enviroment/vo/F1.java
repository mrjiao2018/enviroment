package enviroment.vo;

import enviroment.vo.mpl.Calc;


/**
 * Created by zhong on 2018/7/12 15:39
 */
public class F1 implements Calc {
    private double A;
    private double Ct;
    private double Rt;
    private double Bn;
    private double Ft;
    private String type;
    private double Gz;
    private double Gtt;
    private double Gt;
    private double Ut;

    public double getGz() {
        return Gz;
    }

    public void setGz(double gz) {
        Gz = gz;
    }

    public double getGtt() {
        return Gtt;
    }

    public void setGtt(double gtt) {
        Gtt = gtt;
    }

    public Double getA() {
        return A;
    }

    public void setA(Double a) {
        this.A = a;
    }

    public Double getCt() {
        return Ct;
    }

    public void setCt(Double ct) {
        this.Ct = ct;
    }

    public Double getRt() {
        return Rt;
    }

    public void setRt(Double rt) {
        this.Rt = rt;
    }

    public Double getBn() {
        return Bn;
    }

    public void setBn(Double bn) {
        this.Bn = bn;
    }

    public Double getFt() {
        return Ft;
    }

    public void setFt(Double ft) {
        this.Ft = ft;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getGt() {
        return Gt;
    }

    public void setGt(Double gt) {
        this.Gt = gt;
    }

    public Double getUt() {
        return Ut;
    }

    public void setUt(Double ut) {
        this.Ut = ut;
    }

    @Override
    public void cale() {
        Gt =1.63* Rt * A * Bn + A * Ft;
        Ut = Gt * Ct;

        Format.set2Point(this);
    }
}

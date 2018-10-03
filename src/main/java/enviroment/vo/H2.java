package enviroment.vo;

import enviroment.vo.mpl.Calc;



/**
 * Created by zhong on 2018/7/13 16:52
 */
public class H2 implements Calc {
    private double A;
    private double Ke;
    private double Qe;
    private double Kd;
    private double Qd;
    private double Kf;
    private double Qf;
    private double Ge;
    private double Gd;
    private double Gf;
    private double Gz;
    private double Ue;
    private double Ud;
    private double Uf;
    private double Uz;
    private String type;

    public Double getA() {
        return A;
    }

    public void setA(Double a) {
        this.A = a;
    }

    public Double getKe() {
        return Ke;
    }

    public void setKe(Double ke) {
        this.Ke = ke;
    }

    public Double getQe() {
        return Qe;
    }

    public void setQe(Double qe) {
        this.Qe = qe;
    }

    public Double getKd() {
        return Kd;
    }

    public void setKd(Double kd) {
        this.Kd = kd;
    }

    public Double getQd() {
        return Qd;
    }

    public void setQd(Double qd) {
        this.Qd = qd;
    }

    public Double getKf() {
        return Kf;
    }

    public void setKf(Double kf) {
        this.Kf = kf;
    }

    public Double getQf() {
        return Qf;
    }

    public void setQf(Double qf) {
        this.Qf = qf;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void cale() {
Ge=Qe*A;
Gf=Qf*A;
Gd=Qd*A;
Ue=Ge*Ke;
Uf=Gf*Kf;
Ud=Gd*Kd;

Gz=Ge+Gf+Gd;
Uz=Ue+Uf+Ud;
    }
}

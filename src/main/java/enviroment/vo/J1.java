package enviroment.vo;

import enviroment.vo.mpl.Calc;


/**
 * Created by zhong on 2018/7/13 16:52
 */
public class J1 implements Calc {
    private double Ss;
    private double A;
    private double Us;
    private String type;

    public Double getSs() {
        return Ss;
    }

    public void setSs(Double ss) {
        this.Ss = ss;
    }

    public Double getA() {
        return A;
    }

    public void setA(Double a) {
        this.A = a;
    }

    public Double getUs() {
        return Us;
    }

    public void setUs(Double us) {
        this.Us = us;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void cale() {
Us = Ss * A;
        Format.set2Point(this);
    }
}

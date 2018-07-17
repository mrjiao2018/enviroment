package enviroment.vo;

import enviroment.vo.mpl.Calc;


/**
 * Created by zhong on 2018/7/13 16:52
 */
public class K1 implements Calc {
    private double Uz;
    private double A;
    private double Us;
    private String type;

    public Double getUz() {
        return Uz;
    }

    public void setUz(Double uz) {
        this.Uz = uz;
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

    public K1() {
        Us =0.0;
    }

    @Override
    public void cale() {
        Us = Uz *A/100;
    }
}

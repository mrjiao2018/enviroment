package enviroment.vo;

import enviroment.vo.mpl.Calc;


/**
 * Created by zhong on 2018/7/13 16:52
 */
public class H3 implements Calc {
    private double Az;
    private double Kz;
    private double Uz;
    private String type;

    public Double getAz() {
        return Az;
    }

    public void setAz(Double az) {
        this.Az = az;
    }

    public Double getKz() {
        return Kz;
    }

    public void setKz(Double kz) {
        this.Kz = kz;
    }

    public Double getUz() {
        return Uz;
    }

    public void setUz(Double uz) {
        this.Uz = uz;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void cale() {
Uz = Kz * Az;
    }
}

package enviroment.vo;

import enviroment.vo.mpl.Calc;

public class B1 implements Calc {
    private double M;
    private double f;
    private double Am;
    private double Le;

    private String type;

    public double getM() {\


        return M;
    }

    public void setM(double m) {
        M = m;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    public double getAm() {
        return Am;
    }

    public void setAm(double am) {
        Am = am;
    }

    public double getLe() {
        return Le;
    }

    public void setLe(double le) {
        Le = le;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void cale() {
        Le=M*f*Am;
    }
}

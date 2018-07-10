package enviroment.vo;

import enviroment.vo.mpl.Calc;

public class B1 implements Calc {
    private double M;
    private double f;
    private double Am;
    private double Le;

    private String type;
    @Override
    public void cale() {
        Le=M*f*Am;
    }
}

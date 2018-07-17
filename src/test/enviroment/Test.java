package enviroment;

import enviroment.controller.CalcController;

public class Test {

    @org.junit.Test
    public void myTest() {
        CalcController calcController = new CalcController();
        System.out.println(calcController.getClass());
    }
}

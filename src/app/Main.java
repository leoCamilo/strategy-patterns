package app;

import cdp.CalcIR;
import cdp.IrTypes.IrTypeB;
import cdp.IrTypes.IrTypeC;
import cdp.IrTypes.IrTypeD;
import cdp.IrTypes.IrTypeE;

public class Main {

    public static void main(String[] args) {
        CalcIR calculator = new CalcIR();

        calculator.calc(1700);
        calculator.setImposto(new IrTypeB());
        calculator.calc(2000);
        calculator.setImposto(new IrTypeC());
        calculator.calc(3000);
        calculator.setImposto(new IrTypeD());
        calculator.calc(4000);
        calculator.setImposto(new IrTypeE());
        calculator.calc(5000);
    }
}

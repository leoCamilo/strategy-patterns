package cdp;

import cdp.IrTypes.IrTypeA;

public class CalcIR {
    private IRstrategy imposto;

    public IRstrategy getImposto() {
        return imposto;
    }

    public void setImposto(IRstrategy imposto) {
        this.imposto = imposto;
    }

    public void calc(double value){
        System.out.println(imposto.getIrValue(value));
    }

    public CalcIR(){
        imposto = new IrTypeA();
    }
}

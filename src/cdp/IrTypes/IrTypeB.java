package cdp.IrTypes;

import cdp.IRstrategy;

public class IrTypeB implements IRstrategy{
    @Override
    public double getIrValue(double value) {
        return value * 0.075;
    }
}

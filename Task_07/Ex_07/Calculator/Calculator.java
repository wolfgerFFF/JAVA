package Task_07.Ex_07.calculator;

import Task_07.Ex_07.complex.Complex;

public class Calculator implements Calculable{
    private Complex resultCalculation;

    public Calculator(Complex firstArg) {
        this.resultCalculation = firstArg;
    }

    @Override
    public Calculable sum(Complex arg) {
        this.resultCalculation = this.resultCalculation.plus(arg);
        return this;
    }

    @Override
    public Calculable multi(Complex arg) {
        this.resultCalculation = this.resultCalculation.multiply(arg);
        return this;
    }

    @Override
    public Calculable div(Complex arg) {
        this.resultCalculation = this.resultCalculation.divide(arg);
        return this;
    }

    @Override
    public Calculable minus(Complex arg) {
        this.resultCalculation = this.resultCalculation.minus(arg);
        return this;
    }

    @Override
    public Complex getResult() {
        return resultCalculation;
    }
}

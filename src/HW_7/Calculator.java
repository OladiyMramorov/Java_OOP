package HW_7;

public class Calculator implements cOperations {
    private int firstArg;

    public Calculator(int firstArg) {
        this.firstArg = firstArg;
    }

    @Override
    public cOperations sum(int secondArg) {
        firstArg += secondArg;
        return this;
    }

    @Override
    public cOperations multi(int secondArg) {
        firstArg *= secondArg;
        return this;
    }

    @Override
    public cOperations subtraction(int secondArg) {
        firstArg -= secondArg;
        return this;
    }

    @Override
    public cOperations division(int secondArg) {
        firstArg /= secondArg;
        return this;
    }

    @Override
    public int getResult() {
        return firstArg;
    }
}

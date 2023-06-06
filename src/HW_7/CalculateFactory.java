package HW_7;

public class CalculateFactory implements cFactory {
    @Override
    public cOperations create(int firstArg) {
        return new Calculator(firstArg);
    }
}

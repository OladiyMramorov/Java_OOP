package HW_7;

public class LogFile implements cOperations {
    private Logging logger;
    private cOperations calculator;
    public LogFile(Logging logger, cOperations calculator){
        this.calculator = calculator;
        this.logger = logger;
        logger.log("Number " + calculator.getResult());
    }
    @Override
    public cOperations sum(int secondArg) {
        logger.log("Summarizing " + secondArg);
        return calculator.sum(secondArg);
    }

    @Override
    public cOperations multi(int secondArg) {
        logger.log("Multiplying " + secondArg);
        return calculator.multi(secondArg);
    }

    @Override
    public cOperations subtraction(int secondArg) {
        logger.log("Subtraction " + secondArg);
        return calculator.subtraction(secondArg);
    }

    @Override
    public cOperations division(int secondArg) {
        logger.log("Division " + secondArg);
        return calculator.division(secondArg);
    }

    @Override
    public int getResult() {
        int temp = calculator.getResult();
        logger.log("Result " + temp);
        return temp;
    }
}

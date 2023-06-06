package HW_7;

public class CalcFactory implements cFactory {
    private final cFactory calculateFactory;
    private final Logging logger;
    public CalcFactory(cFactory calculateFactory, Logging logger){
        this.calculateFactory = calculateFactory;
        this.logger = logger;
    }

    @Override
    public cOperations create(int firstArg) {
        return new LogFile(logger ,calculateFactory.create(firstArg));
    }
}

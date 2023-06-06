package HW_7;

public class Main {
    public static void main(String[] args) {
        cFactory calculateFactory = new CalculateFactory();
        cFactory calcFactory = new CalcFactory(calculateFactory, new Logging("text.txt"));
        Operation operation = new Operation(calcFactory);
        operation.run();
    }
}
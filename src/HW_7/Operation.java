package HW_7;

import java.util.Scanner;

public class Operation {
    private cFactory calculateFactory;
    public Operation(cFactory calculateFactory){this.calculateFactory = calculateFactory;}

    public void run(){
        while (true){
            int firsArg = printInt("Enter a number: ");
            cOperations calculator = calculateFactory.create(firsArg);
            while (true){
                String cmd = print("Select operation +, -, *, /, =");

                if (cmd.equals("+")) {
                    int arg = printInt("Enter a number: ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("-")) {
                    int arg = printInt("Enter a number: ");
                    calculator.subtraction(arg);
                    continue;
                }
                if (cmd.equals("*")) {
                    int arg = printInt("Enter a number: ");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    int arg = printInt("Enter a number: ");
                    calculator.division(arg);
                    continue;
                }
                if(cmd.equals("=")) {
                    int result = calculator.getResult();
                    System.out.printf("Result %d\n", result);
                    break;
                }
            }
            String cmd = print("Exit program - N/Y?");
            if (cmd.equals("Y") || cmd.equals("y"))
                continue;
            break;

        }

    }
    private int printInt(String massage){
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println(massage);
            try {
                return Integer.parseInt(in.nextLine());

            } catch (NumberFormatException e){
                System.out.println("Enter a number!");
            }
        }
    }
    private String print(String massage){
        Scanner in = new Scanner(System.in);
        System.out.println(massage);
        return in.nextLine();
    }

}

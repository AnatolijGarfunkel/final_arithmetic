import java.util.Random;

public class ArithmeticOperations {
    Random random = new Random();
    private int number1;
    private int number2;
    public void generateNumbers() {
        do {
            number1 = random.nextInt(1, 100);
            number2 = random.nextInt(1, 10);
        }while ( ! (getModule())
                | (number1 == number2)
                | (number1 == 1)
                | (number2 == 1)
                | (number2 == 2) );
    }
    public boolean   getModule    () {
    return number1 % number2 == 0;
}

    public int   add() {
        message();
        System.out.print(number1 + " + " + number2 + " = ");
        return  number1 + number2;
    }
    public int   subtract() {
        message();
        System.out.print(number1 + " - " + number2 + " = ");
        return number1 - number2;
    }
    public int   multiply() {
        message();
        System.out.print(number1 + " * " + number2 + " = ");
        return number1 * number2;
    }
    public int   divide() {
        message();
        return number1 / number2;
    }
    public void message() {
        System.out.println();
        System.out.println("Чему равно следующее вырaжение?");
    }
}

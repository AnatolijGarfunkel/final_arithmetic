import java.util.Random;
import java.util.Scanner;

public class ArithmeticTask {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        ArithmeticOperations arithmetic = new ArithmeticOperations();
        System.out.print("Сколько игроков будет играть в игру: ");
        User.setNumberOfUser(scanner.nextInt());
        User[] user = new User[User.getNumberOfUser()];
        setUsers(User.getNumberOfUser(), user);
        int operation = 0;
        int result = 0;
        int answer = 0;


        for (int currentPlayer = 0; currentPlayer < User.getNumberOfUser(); currentPlayer ++) {
            user[currentPlayer].startPlayMessage();
            for (int i = 0; i < 3; i ++) {
                arithmetic.generateNumbers();
                System.out.println("Выберите операцию: ");
                System.out.println("1: +");
                System.out.println("2: -");
                System.out.println("3: *");
                System.out.println("4: /");
                System.out.println("5: случанйая операция");
                operation = scanner.nextInt();
                if (operation == 5)
                    operation = random.nextInt(1, 5);


                switch (operation) {
                    case 1:
                        result = arithmetic.add();
                        break;
                    case 2:
                        result = arithmetic.subtract();
                        break;
                    case 3:
                        result = arithmetic.multiply();
                        break;
                    case 4:
                        result = arithmetic.divide();
                        break;
                }

                System.out.print("Введите ваш ответ: ");
                answer = scanner.nextInt();
                proofResult(user[currentPlayer], result, answer, operation);
            }
        }


        System.out.println();
        System.out.println("Ура! Опросник завершён! Финальный счёт:");

        for (int i = 0; i < User.getNumberOfUser(); i ++) {
            System.out.println(user[i].getName() + " " + user[i].getPoints());
        }
    }

    public static void  proofResult   (User user, int result, int answer, int operation) {
        System.out.println("Ваш ответ: " + answer + " Правильный ответ: " + result);
        if (answer == result) {
            user.increasePoints(operation * 2);
        }
        else {
            user.decreasePoints(operation * 2);
        }
    }

    public static void setUsers(int numberOfUsers, User[] user) {
        for (int i = 0; i < numberOfUsers; i ++) {
            user[i] = new User(i + 1);
        }
    }
}
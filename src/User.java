import java.util.Scanner;

public class User {
    Scanner scanner = new Scanner(System.in);
    private static int numberOfUser = 0;
    private String name;
    private int points = 0;

    public User (int i) {

        User.message();
        String name = scanner.nextLine();
        if (name.isEmpty())
            this.name = "Player" + i;
        else
            this.name = name;
    }

    public static void setNumberOfUser(int numberOfUser) {
        User.numberOfUser = numberOfUser;
    }

    public static void showFinalResult () {

    }
    public String getName () {
        return this.name;
    }

    public static int getNumberOfUser() {
        return User.numberOfUser;
    }

    public void increasePoints(int i) {
        points = points + i;
    }

    public void decreasePoints(int i) {
        points = points - i;
    }

    public double getPoints() {
        return points;
    }

    public static void message() {
        System.out.print("Введите ваше имя: ");
    }

    public void startPlayMessage() {
        System.out.println();
        System.out.println("Играет " + this.name);
    }
}

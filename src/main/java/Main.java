import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] cars = new Car[3];
        for (int i = 0; i < cars.length; i++) {
            System.out.printf("— Введите название машины №%d: ", i + 1);
            String name = scanner.next();
            boolean validInput = false;
            int speed = 0;

            while (!validInput) {
                try {
                    System.out.printf("— Введите скорость машины №%d:  ", i + 1);
                    speed = scanner.nextInt();
                    if (speed <= 0 | speed > 250) throw new InputMismatchException();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("— Неправильная скорость");
                    scanner.nextLine();
                }
            }
            cars[i] = new Car(name, speed);
        }
        Race.counter(cars);
        System.out.printf("Самая быстрая машина: %s", Race.leader);
        scanner.close();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] cars = new Car[3];
        for (int i = 0; i < cars.length; i++) {
            System.out.printf("— Введите название машины №%d: ", i+1);
            String name = scanner.next();
            System.out.printf("— Введите скорость машины №%d:  ", i+1);
            int speed = scanner.nextInt();
            while (speed <= 0 | speed > 250) {
                System.out.println("— Неправильная скорость");
                System.out.printf("— Введите скорость машины №%d:  ", i+1);
                speed = scanner.nextInt();
            }
            cars[i] = new Car(name, speed);
        }
        Race.counter(cars);
        System.out.printf("Самая быстрая машина: %s", Race.leader);
    }
}
class Car {
    int speed;
    String name;
    Car (String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
}

class Race {
    static String leader;
    public static void counter (Car[] cars) {
        int maxKm = 0;
        for (Car car : cars) {
            if (car.speed * 24 > maxKm) leader = car.name;
        }
    }
}
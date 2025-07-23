public class Race {
    static String leader;

    public static void counter(Car[] cars) {
        int maxKm = 0;
        for (Car car : cars) {
            if (car.speed * 24 > maxKm) leader = car.name;
        }
    }
}
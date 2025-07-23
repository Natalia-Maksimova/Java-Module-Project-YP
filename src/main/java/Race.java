public class Race {
    static String leader;

    public static void counter(Car[] cars) {
        int maxRun = 0;
        for (Car car : cars) {
            if (car.speed * 24 > maxRun) leader = car.name;
        }
    }
}
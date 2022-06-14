package racing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class Cars {

    Map<String, Car> cars = new ConcurrentHashMap<>();

    public Cars(List<String> carNames) {
        generate(carNames);
    }

    private void generate(List<String> carNames) {
        carNames.forEach(carName -> cars.put(carName, new Car(carName)));
    }

    public List<Car> getWinners() {
        return this.cars.values().stream()
                .max(Comparator.comparingInt(Car::getPosition))
                .stream().collect(Collectors.toList());
    }

    public List<Car> values() {
        return new ArrayList<>(cars.values());
    }

    public void moves() {
        cars.values().forEach(Car::advance);
    }
}

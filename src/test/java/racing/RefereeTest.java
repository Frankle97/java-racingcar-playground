package racing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class RefereeTest {

    Cars cars;
    Referee referee;

    @BeforeEach
    void setUp() {
        cars = new Cars(Arrays.asList("name,jade,all,mike,simon".split(",")));
        referee = new Referee(cars, 5);
    }

    @Test
    void winners() {
        List<Car> winners = cars.getWinners();
    }
}

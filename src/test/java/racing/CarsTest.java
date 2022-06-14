package racing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class CarsTest {
    Cars cars;

    @BeforeEach
    void setUp() {
        cars = new Cars(Arrays.asList("name,jade,all,mike,simon".split(",")));
    }

    @Test
    void generateSuccess() {
        assertNotNull(cars);
    }
}

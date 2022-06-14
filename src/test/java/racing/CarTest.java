package racing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarTest {
    Car car;

    @BeforeEach
    void setUp() {
        this.car = new Car("jack");
    }

    @Test
    void carsGenerate() {
        assertNotNull(car);
    }

    @Test
    void whichPosition() {
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    void advancePosition() {
        car.advance();
        assertThat(car.getPosition()).isEqualTo(2);
    }

    @Test
    void carNameLessThanFixedLetter() {
        assertNotNull(car);
    }

    @Test
    void carNameMoreThanFixedLetter() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Car("jackson"));
    }
}

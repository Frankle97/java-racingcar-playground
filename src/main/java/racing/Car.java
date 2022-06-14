package racing;

import java.util.Random;

public class Car {

    private final String name;
    private Integer position = 1;

    public Car(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차의 이름은 5자를 초과할 수 없습니다.");
        }
        this.name = name;
    }

    public Integer getPosition() {
        return this.position;
    }

    public void advance() {
        int randomNumber = new Random().nextInt(9) + 1;
        if (canMove(randomNumber)) {
            this.position++;
        }
    }

    private boolean canMove(int randomNumber) {
        return randomNumber >= 4;
    }

    public String name() {
        return this.name;
    }
}

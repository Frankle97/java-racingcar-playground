package view.out;

import racing.Car;
import racing.Cars;

import java.util.List;

public class OutputConsole {
    private static final String RACING_CARS_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String TRY_COUNT_MESSAGE = "시도할 회수는 몇회인가요?";
    private static final String RESULT_MESSAGE = "실행 결과";
    private static final String GAME_OVER_MESSAGE = "가 최종 우승했습니다.";

    public void enterRaceCarNames() {
        println(RACING_CARS_NAME_MESSAGE);
    }

    public void enterTryCount() {
        println(TRY_COUNT_MESSAGE);
    }

    public void startMessage() {
        println(RESULT_MESSAGE);
    }

    public void relayStatus(Cars cars) {
        List<Car> carList = cars.values();
        for (Car car : carList) {
            StringBuilder message = new StringBuilder(car.name() + " : ");
            for (int i = 0; i < car.getPosition(); i++) {
                message.append("-");
            }
            println(message.toString());
        }
    }

    public void gameOverMessage(Cars cars) {
        StringBuilder message = new StringBuilder();
        List<Car> winners = cars.getWinners();
        for (Car winner : winners) {
            message.append(winner.name());
        }
        println(message + GAME_OVER_MESSAGE);
    }

    private void println(String message) {
        System.out.println(message);
    }

    private void print(String message) {
        System.out.print(message);
    }

}

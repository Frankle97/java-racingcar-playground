import racing.Cars;
import racing.Referee;
import view.in.InputConsole;
import view.out.OutputConsole;

import java.util.List;
import java.util.Scanner;

public class CarRacingApplication {
    public static void main(String[] args) {
        OutputConsole outputConsole = new OutputConsole();
        InputConsole inputConsole = new InputConsole(new Scanner(System.in), outputConsole);

        List<String> carNames = inputConsole.getInputNames();
        Cars cars = new Cars(carNames);
        int tryCount = inputConsole.getTryCount();

        for (int i = 0; i < tryCount; i++) {
            outputConsole.startMessage();
            outputConsole.relayStatus(cars);
            cars.moves();
        }
        outputConsole.gameOverMessage(cars);
    }
}

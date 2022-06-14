package view.in;

import view.out.OutputConsole;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputConsole {
    private final Scanner scanner;
    private final OutputConsole outputConsole;

    public InputConsole(Scanner scanner, OutputConsole outputConsole) {
        this.scanner = scanner;
        this.outputConsole = outputConsole;
    }

    public List<String> getInputNames() {
        outputConsole.enterRaceCarNames();
        String line = scanner.nextLine();
        String[] tokens = line.split(",");
        List<String> names = new ArrayList<>();
        for (String token : tokens) {
            checkNameLength(token);
            names.add(token);
        }

        return names;
    }

    private void checkNameLength(String token) {
        if (token.length() > 5) {
            throw new IllegalArgumentException("자동차의 이름은 5자를 초과할 수 없습니다.");
        }
    }

    public int getTryCount() {
        outputConsole.enterTryCount();
        return scanner.nextInt();
    }
}

package io;

import java.util.Scanner;

public class Input {
    
    private static final Scanner scanner = new Scanner(System.in);
    
    public static String[] getCarNames() {
        String[] carNames = {};
        while (true) {
            try {
                System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분");
                carNames = scanner.nextLine().split(",");
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return carNames;
    }
}
package otusProject.ProjectCurrency;

import java.util.Scanner;

public class EnterNumberImpl implements EnterNumber {
    @Override
    public final String numberPrice() {
        System.out.println("Введите число");
        Scanner console = new Scanner(System.in);

        return console.nextLine();
    }
}
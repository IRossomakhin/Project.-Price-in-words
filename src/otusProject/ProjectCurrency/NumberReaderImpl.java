package otusProject.ProjectCurrency;

import java.util.Scanner;

public class NumberReaderImpl implements NumberReader {
    @Override
    public final String numberPrice() {
        System.out.println("Введите число");
        Scanner console = new Scanner(System.in);

        return console.nextLine();
    }
}
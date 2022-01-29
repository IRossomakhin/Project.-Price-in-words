import java.util.Scanner;

public class PriceInWords {
    public static long numberPrice;

    public static void main(String[] args) {
        Currency currency1 = new Currency(1, "рубль", "рубля", "рублей");

        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextLong()) {
            numberPrice = sc.nextLong();
            System.out.println("Спасибо! Ваше число: ");

            NumbersInLetters numbersInLetters = new NumbersInLetters();
            numbersInLetters.setNumber(numberPrice);
            numbersInLetters.getNumeralsNumber();

        } else {
            System.out.println("Извините, но это не число. Попробуйте заново!");
        }
    }
}

package otusProject.ProjectCurrency;

public class PriceInWords {
    public final EnterNumber enterNumber;
    //public String aaa;

    public PriceInWords(EnterNumber enterNumber) {
        this.enterNumber = enterNumber;
    }

    public void builderWorld(EnterNumber enterNumber) {

        Currency currency1 = new Currency("рубль", "рубля", "рублей");
        // Currency currency2 = new Currency("доллар", "доллара", "долларов");
        //  Currency currency3 = new Currency("крона", "кроны", "крон");
        // можем продолжить набор

        String newNumber = enterNumber.numberPrice();
        try {
            Double.parseDouble(newNumber);
            try {
                long numberPrice = Long.parseLong(newNumber);

                System.out.println("Спасибо! Ваше число: " + numberPrice);

                NumbersInLetters numbersInLetters = new NumbersInLetters();
                numbersInLetters.setNumeralsNumber(numberPrice);
                numbersInLetters.getNumeralsNumber();
            } catch (Exception e) {
                System.out.println("Введено число выше допустимого диапазона 9*10^18");
            }
        } catch (Exception e1) {
            System.out.println("Извините, но это не число. Попробуйте заново!");
        }
    }
}
package otusProject.ProjectCurrency;

public class PriceInWords {
private final EnterNumber enterNumber;

public PriceInWords(EnterNumber enterNumber){
this.enterNumber = enterNumber;
}
        public void builderWorld(EnterNumber enterNumber){

        Currency currency1 = new Currency(1, "рубль", "рубля", "рублей");
       // Currency currency2 = new Currency(2, "доллар", "доллара", "долларов");
        //  Currency currency3 = new Currency(3, "крона", "кроны", "крон");
        // можем продолжить набор

            long numberPrice = enterNumber.numberPrice();

//        System.out.println("Введите число");
//        Scanner sc = new Scanner(System.in);
//        if (sc.hasNextLong()) {
//            numberPrice = sc.nextLong();


            System.out.println("Спасибо! Ваше число: " + numberPrice);

            NumbersInLetters numbersInLetters = new NumbersInLetters();
            numbersInLetters.setNumeralsNumber(numberPrice);
            numbersInLetters.getNumeralsNumber();

//        } else {
//            System.out.println("Извините, но это не число. Попробуйте заново!");
//        }
    }
}

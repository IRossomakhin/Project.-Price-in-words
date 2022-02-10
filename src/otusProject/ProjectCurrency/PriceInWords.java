package otusProject.ProjectCurrency;

public class PriceInWords {
    public NumberReader numberReader;
    public String newNumber;

    public PriceInWords(NumberReader numberReader) {
        this.numberReader = numberReader;
    }


    public void translationInWorld(NumberReader numberReader) {

        Currency currency1 = new Currency("рубль", "рубля", "рублей");
        //Currency currency2 = new Currency("доллар", "доллара", "долларов");
        //Currency currency3 = new Currency("крона", "кроны", "крон");
        // можем продолжить набор

        String newNumber = numberReader.numberPrice();

        Validity validity1 = new Validity(newNumber);
        boolean v = validity1.checkForValidity();
        if (v) {
            long numberPrice = Long.parseLong(newNumber);
            System.out.println("Спасибо! Ваше число: " + numberPrice);

            NumbersInLetters numbersInLetters = new NumbersInLetters();
            numbersInLetters.setNumeralsNumber(numberPrice);
            numbersInLetters.getNumeralsNumber();
        } else {
            System.out.println("");
        }
    }
}
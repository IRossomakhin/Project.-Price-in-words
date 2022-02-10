package otusProject;

import otusProject.ProjectCurrency.*;

public class TranslatingNumbersIntoWords {


    public static void main(String[] args) {
        NumberReader numberReader = new NumberReaderImpl();
        PriceInWords priceInWords = new PriceInWords(numberReader);
        priceInWords.translationInWorld(numberReader);

    }
}

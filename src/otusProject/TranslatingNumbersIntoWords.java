package otusProject;

import otusProject.ProjectCurrency.*;

public class TranslatingNumbersIntoWords {


    public static void main(String[] args) {
        EnterNumber enterNumber = new EnterNumberImpl();
        PriceInWords priceInWords = new PriceInWords(enterNumber);
        priceInWords.builderWorld(enterNumber);

    }
}

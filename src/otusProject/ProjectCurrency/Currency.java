package otusProject.ProjectCurrency;

public class Currency {
    public static String nominativeSingular;
    public static String genitiveSingular;
    public static String genitivePlural;

    Currency(String nominativeSingular, String genitiveSingular, String genitivePlural) {
        Currency.nominativeSingular = nominativeSingular;
        Currency.genitiveSingular = genitiveSingular;
        Currency.genitivePlural = genitivePlural;
    }

    public static String getNominativeSingular() {
        return nominativeSingular;
    }

    public static String getGenitiveSingular() {
        return genitiveSingular;
    }

    public static String getGenitivePlural() {
        return genitivePlural;
    }

}

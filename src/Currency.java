public class Currency {
    private final int idCurrency;
    private static String nominativeSingular;
    private static String genitiveSingular;
    private static String genitivePlural;

   Currency(int idCurrency, String nominativeSingular, String genitiveSingular, String genitivePlural) {
        this.idCurrency = idCurrency;
        Currency.nominativeSingular = nominativeSingular;
        Currency.genitiveSingular = genitiveSingular;
        Currency.genitivePlural = genitivePlural;
    }

    public  int getidCurrencyidCurrency() {
        return idCurrency;
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

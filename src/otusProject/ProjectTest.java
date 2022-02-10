package otusProject;

import otusProject.ProjectCurrency.NumberReader;
import otusProject.ProjectCurrency.PriceInWords;

public final class ProjectTest {
    public static void main(String[] args) {

        should_Exception_IfNumberGreaterThanLong();
        should_Exception_IfInputText();
        checkingForNegativeNumberInput_Waiting_WordMinus();
        checkingForEnteringZeroNumber_Waiting_Word_Zero();
        checkingForEnteringZeroAtBeginningOfNumber();
        declinationCheckForNumberTwoThousand();
    }

    public static void should_Exception_IfNumberGreaterThanLong() {

        class NumberReaderImpl1 implements NumberReader {
            final String i = "9223372036854775808";

            @Override
            public final String numberPrice() {
                return i;
            }
        }
        System.out.println("Тест 1. Проверка на ввод числа больше диапазона long - 9223372036854775808");
        NumberReader numberReaderImpl1 = new NumberReaderImpl1();
        PriceInWords priceInWords = new PriceInWords(numberReaderImpl1);
        priceInWords.translationInWorld(numberReaderImpl1);
    }


    public static void should_Exception_IfInputText() {

        class NumberReaderImpl2 implements NumberReader {

            final String i = "ABCDEFG";

            @Override
            public final String numberPrice() {
                return i;
            }
        }
        System.out.println("Тест 2. Проверка на случай ввода текста - Abcd07EFG");
        NumberReader numberReaderImpl2 = new NumberReaderImpl2();
        PriceInWords priceInWords = new PriceInWords(numberReaderImpl2);
        priceInWords.translationInWorld(numberReaderImpl2);
    }


    public static void checkingForNegativeNumberInput_Waiting_WordMinus() {

        class NumberReaderImpl3 implements NumberReader {

            final String i = "-37";

            @Override
            public String numberPrice() {
                return i;
            }
        }
        System.out.println("Тест 3. Проверка для случая ввода отрицательного числа '-37'. Ожидание - 'минус тридцать семь'");
        NumberReader numberReaderImpl3 = new NumberReaderImpl3();
        PriceInWords priceInWords = new PriceInWords(numberReaderImpl3);
        priceInWords.translationInWorld(numberReaderImpl3);
    }


    public static void checkingForEnteringZeroNumber_Waiting_Word_Zero() {

        class NumberReaderImpl4 implements NumberReader {

            final String i = "0";

            @Override
            public String numberPrice() {
                return i;
            }
        }
        System.out.println("Тест 4. Проверка для значения 0 руб. Ожидание - не пустое место, а 'ноль рублей'");
        NumberReader numberReaderImpl4 = new NumberReaderImpl4();
        PriceInWords priceInWords = new PriceInWords(numberReaderImpl4);
        priceInWords.translationInWorld(numberReaderImpl4);
    }

    public static void checkingForEnteringZeroAtBeginningOfNumber() {

        class NumberReaderImpl5 implements NumberReader {

            final String i = "075";

            @Override
            public String numberPrice() {
                return i;
            }
        }
        System.out.println("Тест 5. Проверка для случая ввода нуля в начале числа. Пример 075. Ожидание - семьдесят пять рублей");
        NumberReader numberReaderImpl5 = new NumberReaderImpl5();
        PriceInWords priceInWords = new PriceInWords(numberReaderImpl5);
        priceInWords.translationInWorld(numberReaderImpl5);
    }

    public static void declinationCheckForNumberTwoThousand() {

        class NumberReaderImpl6 implements NumberReader {

            final String i = "2745";

            @Override
            public String numberPrice() {
                return i;
            }
        }
        System.out.println("Тест 6. Проверка исключения для числительного Две тысячи. Пример 2745. Ожидание - 'две тысячи' а не 'два тысяча'");
        NumberReader numberReaderImpl6 = new NumberReaderImpl6();
        PriceInWords priceInWords = new PriceInWords(numberReaderImpl6);
        priceInWords.translationInWorld(numberReaderImpl6);
    }
}




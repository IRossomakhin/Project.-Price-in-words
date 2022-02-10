package otusProject;

import otusProject.ProjectCurrency.NumberReader;
import otusProject.ProjectCurrency.PriceInWords;

public final class ProjectTest {
    public static void main(String[] args) {

        Should_Exception_IfNumberGreaterThanLong();
        Should_Exception_IfInputText();
        CheckingForNegativeNumberInput_Waiting_WordMinus();
        CheckingForEnteringZeroNumber_Waiting_Word_Zero();
        CheckingForEnteringZeroAtBeginningOfNumber();
        DeclinationCheckForNumberTwoThousand();
    }

    public static void Should_Exception_IfNumberGreaterThanLong() {

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
        priceInWords.builderWorld(numberReaderImpl1);
    }


    public static void Should_Exception_IfInputText() {

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
        priceInWords.builderWorld(numberReaderImpl2);
    }


    public static void CheckingForNegativeNumberInput_Waiting_WordMinus() {

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
        priceInWords.builderWorld(numberReaderImpl3);
    }


    public static void CheckingForEnteringZeroNumber_Waiting_Word_Zero() {

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
        priceInWords.builderWorld(numberReaderImpl4);
    }

    public static void CheckingForEnteringZeroAtBeginningOfNumber() {

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
        priceInWords.builderWorld(numberReaderImpl5);
    }

    public static void DeclinationCheckForNumberTwoThousand() {

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
        priceInWords.builderWorld(numberReaderImpl6);
    }
}




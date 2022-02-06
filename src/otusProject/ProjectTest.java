package otusProject;

import otusProject.ProjectCurrency.EnterNumber;
import otusProject.ProjectCurrency.PriceInWords;

public final class ProjectTest {
    public static void main(String[] args) {

        new Should_Exception_IfNumberGreaterThanLong().test1();
        new Should_Exception_IfInputText().test2();
        new CheckingForNegativeNumberInput_Waiting_WordMinus().test3();
        new CheckingForEnteringZeroNumber_Waiting_Word_Zero().test4();
        new CheckingForEnteringZeroAtBeginningOfNumber().test5();
        new DeclinationCheckForNumberTwoThousand().test6();
    }

    public static class Should_Exception_IfNumberGreaterThanLong {
        private void test1() {

            class EnterNumberImpl1 implements EnterNumber {
                final String i = "9223372036854775808";

                @Override
                public final String numberPrice() {
                    return i;
                }
            }
            System.out.println("Тест 1. Проверка на ввод числа больше диапазона long - 9223372036854775808");
            EnterNumber enterNumberImpl1 = new EnterNumberImpl1();
            PriceInWords priceInWords = new PriceInWords(enterNumberImpl1);
            priceInWords.builderWorld(enterNumberImpl1);
        }
    }


    public static class Should_Exception_IfInputText {
        public void test2() {

            class EnterNumberImpl2 implements EnterNumber {

                final String i = "ABCDEFG";

                @Override
                public final String numberPrice() {
                    return i;
                }
            }
            System.out.println("Тест 2. Проверка на случай ввода текста - Abcd07EFG");
            EnterNumber enterNumberImpl2 = new EnterNumberImpl2();
            PriceInWords priceInWords = new PriceInWords(enterNumberImpl2);
            priceInWords.builderWorld(enterNumberImpl2);
        }
    }


    public static class CheckingForNegativeNumberInput_Waiting_WordMinus {
        public void test3() {

            class EnterNumberImpl3 implements EnterNumber {

                final String i = "-37";

                @Override
                public String numberPrice() {
                    return i;
                }
            }
            System.out.println("Тест 3. Проверка для случая ввода отрицательного числа '-37'. Ожидание - 'минус тридцать семь'");
            EnterNumber enterNumberImpl3 = new EnterNumberImpl3();
            PriceInWords priceInWords = new PriceInWords(enterNumberImpl3);
            priceInWords.builderWorld(enterNumberImpl3);
        }
    }

    public static class CheckingForEnteringZeroNumber_Waiting_Word_Zero {
        public void test4() {

            class EnterNumberImpl4 implements EnterNumber {

                final String i = "0";

                @Override
                public String numberPrice() {
                    return i;
                }
            }
            System.out.println("Тест 4. Проверка для значения 0 руб. Ожидание - не пустое место, а 'ноль рублей'");
            EnterNumber enterNumberImpl4 = new EnterNumberImpl4();
            PriceInWords priceInWords = new PriceInWords(enterNumberImpl4);
            priceInWords.builderWorld(enterNumberImpl4);
        }
    }

    public static class CheckingForEnteringZeroAtBeginningOfNumber {
        public void test5() {

            class EnterNumberImpl5 implements EnterNumber {

                final String i = "075";

                @Override
                public String numberPrice() {
                    return i;
                }
            }
            System.out.println("Тест 5. Проверка для случая ввода нуля в начале числа. Пример 075. Ожидание - семьдесят пять рублей");
            EnterNumber enterNumberImpl5 = new EnterNumberImpl5();
            PriceInWords priceInWords = new PriceInWords(enterNumberImpl5);
            priceInWords.builderWorld(enterNumberImpl5);
        }
    }

    public static class DeclinationCheckForNumberTwoThousand {
        public void test6() {

            class EnterNumberImpl6 implements EnterNumber {

                final String i = "2745";

                @Override
                public String numberPrice() {
                    return i;
                }
            }
            System.out.println("Тест 6. Проверка исключения для числительного Две тысячи. Пример 2745. Ожидание - 'две тысячи' а не 'два тысяча'");
            EnterNumber enterNumberImpl6 = new EnterNumberImpl6();
            PriceInWords priceInWords = new PriceInWords(enterNumberImpl6);
            priceInWords.builderWorld(enterNumberImpl6);
        }
    }


}






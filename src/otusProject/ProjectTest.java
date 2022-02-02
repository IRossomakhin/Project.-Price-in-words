package otusProject;

import otusProject.ProjectCurrency.EnterNumber;
import otusProject.ProjectCurrency.PriceInWords;

public class ProjectTest {

    public static class Test1 {
        public void test1() {

            class EnterNumberImpl1 implements EnterNumber {
                private long i1 = -156L;

                @Override
                public Long numberPrice() {
                    return i1;
                }
            }
            System.out.println("Тест 1. Проверяем перевод в пропись отрицательного числа");
            EnterNumber enterNumberImpl1 = new EnterNumberImpl1();
            PriceInWords priceInWords = new PriceInWords(enterNumberImpl1);
            priceInWords.builderWorld(enterNumberImpl1);
        }
    }


    public static class Test2 {
        public void test2() {

            class EnterNumberImpl1 implements EnterNumber {
                private long i1 = 1000L;

                @Override
                public Long numberPrice() {
                    return i1;
                }
            }
            System.out.println("Тест 2. Проверка для случая 1000 - ОДНА тысяча рублей");
            EnterNumber enterNumberImpl1 = new EnterNumberImpl1();
            PriceInWords priceInWords = new PriceInWords(enterNumberImpl1);
            priceInWords.builderWorld(enterNumberImpl1);
        }
    }

    public static class Test3 {
        public void test3() {

            class EnterNumberImpl1 implements EnterNumber {
                private long i1 = 9223372036854775807L;

                @Override
                public Long numberPrice() {
                    return i1;
                }
            }
            System.out.println("Тест 3. Проверка для очень большого числа");
            EnterNumber enterNumberImpl1 = new EnterNumberImpl1();
            PriceInWords priceInWords = new PriceInWords(enterNumberImpl1);
            priceInWords.builderWorld(enterNumberImpl1);
        }
    }


    public static void main(String[] args) {

        new otusProject.ProjectTest.Test1().test1();
        new otusProject.ProjectTest.Test2().test2();
        new otusProject.ProjectTest.Test3().test3();
    }
}

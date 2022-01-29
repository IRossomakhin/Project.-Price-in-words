public class NumbersInLetters {
    long numberPrice;
    public static String finalNumber;
    public static String aaa;
    public static String ddd;
    public static String numberSign;

    public void setNumber(long numberPrice) {
        this.numberPrice = numberPrice;
    }

    public final void getNumeralsNumber() {
        int[] newNumeralsNumber = new int[3];
        ddd = "";
        numberSign = "";
        int i = 0;

        if (numberPrice < 0) {
            numberSign = "минус ";
            numberPrice = Math.abs(numberPrice);
        }

        while (true) {
            int remainderOfDivisionClassNumber = Math.toIntExact(numberPrice % 1000); //"Остаток от деления 1000"
            long integerPartClassNumber = numberPrice / 1000; //"Целая часть от деления на 1000"

            int j = 0;
            while (j < 3) {
                int remainderOfDivisionNumber = Math.toIntExact(remainderOfDivisionClassNumber % 10); //"Остаток от деления"
                int integerPartNumber = remainderOfDivisionClassNumber / 10; //"Целая часть от деления"
                newNumeralsNumber[j] = remainderOfDivisionNumber;
                remainderOfDivisionClassNumber = integerPartNumber;
                j++;
            }
            if (newNumeralsNumber[2] + newNumeralsNumber[1] + newNumeralsNumber[0] == 0) {
                finalNumber = "";
            } else {
                if (newNumeralsNumber[1] == 1) {
                    String b = NameNumbers.nameNumbers[1][newNumeralsNumber[0]];
                    String c = NameNumbers.nameNumbers[3][newNumeralsNumber[2]];
                    finalNumber = c + " " + b;
                } else {
                    if (newNumeralsNumber[0] == 0) {
                        String b = NameNumbers.nameNumbers[2][newNumeralsNumber[1]];
                        String c = NameNumbers.nameNumbers[3][newNumeralsNumber[2]];
                        finalNumber = c + " " + b;
                    } else {
                        if (i == 1 & newNumeralsNumber[0] > 0 & newNumeralsNumber[0] < 3) {
                            String a = NameNumbers.nameNumbers[4][newNumeralsNumber[0]];
                            String b = NameNumbers.nameNumbers[2][newNumeralsNumber[1]];
                            String c = NameNumbers.nameNumbers[3][newNumeralsNumber[2]];
                            finalNumber = c + " " + b + " " + a;
                        } else {
                            String a = NameNumbers.nameNumbers[0][newNumeralsNumber[0]];
                            String b = NameNumbers.nameNumbers[2][newNumeralsNumber[1]];
                            String c = NameNumbers.nameNumbers[3][newNumeralsNumber[2]];
                            finalNumber = c + " " + b + " " + a;
                        }
                    }
                }
            }


            if (newNumeralsNumber[1] == 1) {
                if (i == 0) {
                    aaa = Currency.getGenitivePlural();
                } else {
                    aaa = NameNumberClass.nameClass[i][2];
                }
                // - 1 Род.падеж Мн.число - рублей";
            } else {
                if (newNumeralsNumber[0] == 1) {
                    if (i == 0) {
                        aaa = Currency.getNominativeSingular();
                    } else {
                        aaa = NameNumberClass.nameClass[i][0];
                    }
                    //" -2 Имен.падеж Ед.число - рубль";

                } else {
                    if (newNumeralsNumber[0] > 1 & newNumeralsNumber[0] < 5) {
                        if (i == 0) {
                            aaa = Currency.getGenitiveSingular();
                        } else {
                            aaa = NameNumberClass.nameClass[i][1];
                        }//" -3 Род.падеж Ед.число - рубля";
                    } else {
                        if (i == 0) {
                            aaa = Currency.getGenitivePlural();
                        } else {
                            if (newNumeralsNumber[0] + newNumeralsNumber[1] + newNumeralsNumber[2] == 0) {
                                aaa = "";
                            } else {
                                aaa = NameNumberClass.nameClass[i][2];
                            }
                        }//" - 4 Род.падеж Мн.число - рублей";
                    }
                }
            }
            //   System.out.println("печатаем в конце " + finalNumber + " " + aaa);
            ddd = finalNumber + " " + aaa + " " + ddd;
            if (integerPartClassNumber == 0) {
                break;
            }
            numberPrice = integerPartClassNumber;
            i++;


        }
        if (numberPrice == 0) {
            System.out.println("ноль рублей");
        } else {
            System.out.println(numberSign + ddd);
        }
    }


}


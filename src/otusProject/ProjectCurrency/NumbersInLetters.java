package otusProject.ProjectCurrency;

public class NumbersInLetters {
    long numberPrice;
    public  String finalNumber;
    public  String nameNumbersClass;
    public  String numberSign;

    public void setNumeralsNumber(long numberPrice) {
        this.numberPrice = numberPrice;
    }

    public final void getNumeralsNumber() {
        int[] newNumeralsNumber = new int[3];
        StringBuilder totalWord = new StringBuilder();
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
                    String theSecondNumber = NameNumbers.nameNumbers[1][newNumeralsNumber[0]];
                    String theThirdNumber = NameNumbers.nameNumbers[3][newNumeralsNumber[2]];
                    finalNumber = theThirdNumber + " " + theSecondNumber;
                } else {
                    if (newNumeralsNumber[0] == 0) {
                        String theSecondNumber = NameNumbers.nameNumbers[2][newNumeralsNumber[1]];
                        String theThirdNumber = NameNumbers.nameNumbers[3][newNumeralsNumber[2]];
                        finalNumber = theThirdNumber + " " + theSecondNumber;
                    } else {
                        if (i == 1 & newNumeralsNumber[0] > 0 & newNumeralsNumber[0] < 3) {
                            String theFirstNumber = NameNumbers.nameNumbers[4][newNumeralsNumber[0]];
                            String theSecondNumber = NameNumbers.nameNumbers[2][newNumeralsNumber[1]];
                            String theThirdNumber = NameNumbers.nameNumbers[3][newNumeralsNumber[2]];
                            finalNumber = theThirdNumber + " " + theSecondNumber + " " + theFirstNumber;
                        } else {
                            String theFirstNumber = NameNumbers.nameNumbers[0][newNumeralsNumber[0]];
                            String theSecondNumber = NameNumbers.nameNumbers[2][newNumeralsNumber[1]];
                            String theThirdNumber = NameNumbers.nameNumbers[3][newNumeralsNumber[2]];
                            finalNumber = theThirdNumber + " " + theSecondNumber + " " + theFirstNumber;
                        }
                    }
                }
            }


            if (newNumeralsNumber[1] == 1) {
                if (i == 0) {
                    nameNumbersClass = Currency.getGenitivePlural();
                } else {
                    nameNumbersClass = NameNumberClass.nameClass[i][2];
                }
                // - 1 Род.падеж Мн.число - рублей";
            } else {
                if (newNumeralsNumber[0] == 1) {
                    if (i == 0) {
                        nameNumbersClass = Currency.getNominativeSingular();
                    } else {
                        nameNumbersClass = NameNumberClass.nameClass[i][0];
                    }
                    //" -2 Имен.падеж Ед.число - рубль";

                } else {
                    if (newNumeralsNumber[0] > 1 & newNumeralsNumber[0] < 5) {
                        if (i == 0) {
                            nameNumbersClass = Currency.getGenitiveSingular();
                        } else {
                            nameNumbersClass = NameNumberClass.nameClass[i][1];
                        }//" -3 Род.падеж Ед.число - рубля";
                    } else {
                        if (i == 0) {
                            nameNumbersClass = Currency.getGenitivePlural();
                        } else {
                            if (newNumeralsNumber[0] + newNumeralsNumber[1] + newNumeralsNumber[2] == 0) {
                                nameNumbersClass = "";
                            } else {
                                nameNumbersClass = NameNumberClass.nameClass[i][2];
                            }
                        }//" - 4 Род.падеж Мн.число - рублей";
                    }
                }
            }

            totalWord.insert(0,nameNumbersClass);
            totalWord.insert(0," ");
            totalWord.insert(0,finalNumber);
            totalWord.insert(0," ");
          //  numeralWordsString = finalNumber + " " + nameNumbersClass + " " + numeralWordsString;
            if (integerPartClassNumber == 0) {
                break;
            }
            numberPrice = integerPartClassNumber;
            i++;


        }
        if (numberPrice == 0) {
            System.out.println("ноль " + Currency.getGenitivePlural());
        } else {
            System.out.println(numberSign + totalWord);
        }
    }


}


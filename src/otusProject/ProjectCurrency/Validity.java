package otusProject.ProjectCurrency;

public class Validity {
    public String number;
    public boolean v;

    Validity(String number) {
        this.number = number;
    }

    public boolean checkForValidity() {

        try {
            Double.parseDouble(number);
            try {
                Long.parseLong(number);
                v = true;
            } catch (Exception exception) {
                System.out.println("Введено число выше допустимого диапазона 9*10^18");
                v = false;
            }
        } catch (Exception exception) {
            System.out.println("Извините, но это не число. Попробуйте заново!");
            v = false;
        }
        return v;

    }


}



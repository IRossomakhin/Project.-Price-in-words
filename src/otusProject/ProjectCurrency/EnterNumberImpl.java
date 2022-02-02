package otusProject.ProjectCurrency;

import java.util.Random;

public class EnterNumberImpl implements EnterNumber {
    @Override
    public Long numberPrice() {
        return new Random().nextLong();
    }
}
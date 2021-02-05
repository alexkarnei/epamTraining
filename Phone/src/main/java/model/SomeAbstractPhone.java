package model;

public abstract class SomeAbstractPhone {

    private int yearProduction;
    private String manufactured;

    public SomeAbstractPhone(int yearProduction, String manufactured) {
        this.yearProduction = yearProduction;
    }

    private void openConnection() {
    }

    public void call(int outPutNumber) {
        openConnection();
    }

    public void ring(int inputNumber) {
    }
}

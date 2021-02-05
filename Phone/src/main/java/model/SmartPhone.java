package model;

public class SmartPhone extends WirelessPhone {
    private String operationSystem;

    public SmartPhone(int yearProduction, String manufactured, int battery, String operationSystem) {
        super(yearProduction, manufactured, battery);
        this.operationSystem = operationSystem;
    }

    private void install(String program) {
    }

    @Override
    public void call(int outPutNumber) {
        System.out.printf("Видеовызов абонента  %s", outPutNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.printf("Входящий видеовызов от обонента  %s",inputNumber);;
    }
}

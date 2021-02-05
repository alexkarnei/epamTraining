package model;

public class CellPhone extends WirelessPhone {

    public CellPhone(int yearProduction, String manufactured, int battery) {
        super(yearProduction, manufactured, battery);
    }

    @Override
    public void call(int outPutNumber) {
        System.out.println("Вызываю абонента " + outPutNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Звонит абонент " + inputNumber);
    }
}

package model;

public class ThomasEdisonPhone extends SomeAbstractPhone {

    public ThomasEdisonPhone(int year, String manufactured) {
        super(year, manufactured);
    }

    @Override
    public void call(int outPutNumber) {
        System.out.println("Кручу ручку ");
        System.out.println(" Сообщите номер телефона " + outPutNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Телефон звонит");
    }
}

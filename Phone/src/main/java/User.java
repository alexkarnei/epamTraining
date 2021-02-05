import model.SomeAbstractPhone;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void callAnotherUser(int number, SomeAbstractPhone someAbstractPhone) {
        someAbstractPhone.call(number);
    }
}

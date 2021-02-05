import model.CellPhone;
import model.SmartPhone;
import model.SomeAbstractPhone;
import model.ThomasEdisonPhone;

public class Controller {

    public static void main(String[] args) {
        User user = new User("Андрей");
        SomeAbstractPhone tomsEdisonPhone = new ThomasEdisonPhone(1897, "Thomas");
        SomeAbstractPhone panasonicPhone = new CellPhone(1997, "Panasonic", 200);
        SomeAbstractPhone apple = new SmartPhone(2013, "Apple", 1000, "iOS");
        user.callAnotherUser(2244556, tomsEdisonPhone);
        user.callAnotherUser(2536, panasonicPhone);
        user.callAnotherUser(123456, apple);
    }
}

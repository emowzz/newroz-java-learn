public class Main {
    public static void main(String[] args) {
        ITelephone EmonPhone;
        EmonPhone = new DeskPhone(123456);
        EmonPhone.powerOn();
        EmonPhone.dial(123456);
        EmonPhone.callPhone(123456);
        EmonPhone.answer();

        EmonPhone = new MobilePhone(24565);
        EmonPhone.powerOn();
        EmonPhone.dial(24565);
        EmonPhone.callPhone(24565);
        EmonPhone.answer();
    }
}

package section9;

public class Main {

    public static void main(String[] args) {

        ITelephone timsPhone;
        timsPhone= new DeskPhone(1234455);
        timsPhone.powerOn();
        timsPhone.callPhone(1234567);
        timsPhone.answer();

        timsPhone= new MobilePhone(24455);
        timsPhone.callPhone(24455);
        timsPhone.answer();
    }
}

package section9;

public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
    isOn=true;
        System.out.println("No action taken mobile phone");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("now ringing" + phoneNumber + " on mobile phone");
        }else{
            System.out.println("Phone is switched off");
        }
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answering the mobile phone");
            isRinging=false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber && isOn){
            isRinging=true;
            System.out.println("Melody r ing ");
        }else{
            isRinging=false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging ;
    }
}

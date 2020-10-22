package finalll;

public class Password {

    private static final int key = 7823;
    private final int encryptedPAsw;

    public Password(int encryptedPAsw) {
        this.encryptedPAsw = encryptDecrypt(encryptedPAsw);
    }

    private int encryptDecrypt(int password){
        return password ^ key;
    }

    public final void storePassword(){
        System.out.println("Saving password as "+ this.encryptedPAsw);
    }

    public boolean letMeIn(int password){
        if(encryptDecrypt(password)==this.encryptedPAsw){
            System.out.println("Welcome");
            return true;
        }else{
            System.out.println("nope, you cannot come in");
            return false;
        }

    }
}

package trenEx;

public abstract class  Vagon {

    int pasageri;
    int colete;


    public abstract void deschidereUsi();

    public abstract void inchidereUsi();

    public int getPasageri() {
        return pasageri;
    }

    public void setPasageri(int pasageri) {
        this.pasageri = pasageri;
    }

    public int getColete() {
        return colete;
    }

    public void setColete(int colete) {
        this.colete = colete;
    }
}

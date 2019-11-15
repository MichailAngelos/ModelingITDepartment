package Models;

public class Kathigitis extends Xristis {

    private int AM;
    private String eidikeusi;

    public Kathigitis(String Onoma, String Epitheto, int Tilefono, String Dieuthunsi, int AM, String eidikeusi) {
        super(Onoma, Epitheto, Tilefono, Dieuthunsi);
        this.AM = AM;
        this.eidikeusi = eidikeusi;
    }

    public int getAM() {
        return AM;
    }

    public void setAM(int AM) {
        this.AM = AM;
    }

    public String getEidikeusi() {
        return eidikeusi;
    }

    public void setEidikeusi(String eidikeusi) {
        this.eidikeusi = eidikeusi;
    }


}



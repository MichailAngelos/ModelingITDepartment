package Models;


public class Foititis extends Xristis{

    private int AM;
    private int eksamino;
    private int etosEisagogis;
    private double deiktisProodou;

    private static Foititis studentInstance = null;

    public Foititis(){
        super();
    }
    public Foititis(String onoma ,String epitheto,int tilefono , String dieuthinsi,int AM,int eksamino,int etosEisagogis,double deiktisProodou){
        super(onoma, epitheto, tilefono, dieuthinsi);


        this.AM=AM;
        this.eksamino=eksamino;
        this.etosEisagogis=etosEisagogis;
        this.deiktisProodou = deiktisProodou;
    }

    public void login() {
        studentInstance = this;
    }

    public void logout() {
        studentInstance = null;
    }

    public int getAM() {
        return AM;
    }

    public double getDeiktisProodou() {
        return deiktisProodou;
    }

    public void setDeiktisProodou(double deiktisProodou) {
        this.deiktisProodou = deiktisProodou;
    }

    public int getEksamino() {
        return eksamino;
    }

    public void setEksamino(int eksamino) {
        this.eksamino = eksamino;
    }

    public int getEtosEisagogis() {
        return etosEisagogis;
    }

    public void setEtosEisagogis(int etosEisagogis) {
        this.etosEisagogis = etosEisagogis;
    }

    public static Foititis getStudentInstance() {
        return studentInstance;
    }

    public static void setStudentInstance(Foititis studentInstance) {
        Foititis.studentInstance = studentInstance;
    }
}



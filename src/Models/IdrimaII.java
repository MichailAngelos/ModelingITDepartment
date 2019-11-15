package Models;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;

public class IdrimaII {


    private String onoma;
    private String dieuthinsi;
    private String istoselida;
    private int tilefono;

    private List<IdrimaII> departments = new ArrayList<IdrimaII>();
    private List<Xristis> users = new ArrayList<Xristis>();


    private static IdrimaII idrimaInstance = null;

    public IdrimaII(){}

    public IdrimaII(String onoma, String dieuthinsi, String istoselida, int tilefono){
    this.onoma = onoma;
    this.dieuthinsi= dieuthinsi;
    this.istoselida = istoselida;
    this.tilefono = tilefono;
    }

    public String getOnoma(){ return onoma;}

    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }

    public int getTilefono() {
        return tilefono;
    }

    public void setTilefono(int tilefono) {
        this.tilefono = tilefono;
    }

    public String getDieuthinsi() {
        return dieuthinsi;
    }

    public void setDieuthinsi(String dieuthinsi) {
        this.dieuthinsi = dieuthinsi;
    }


    public String getIstoselida() {
        return istoselida;
    }

    public void setIstoselida(String istoselida) {
        this.istoselida = istoselida;
    }
    public static IdrimaII getIdrimaInstance() {
        return idrimaInstance;
    }



    public static void setUniversityInstance(IdrimaII idrimaInstance) {
        IdrimaII.idrimaInstance = idrimaInstance;
    }
}

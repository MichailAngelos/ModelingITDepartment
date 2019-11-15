package Models;

import java.util.List;

public class Xristis
{


private String onoma;
private String epitheto;
private int tilefono;
private String dieuthinsi;
private String username;
private String password;
private static Xristis userInstance = null;


    public Xristis(String onoma , String epitheto, int tilefono , String dieuthinsi,String username ,String password){

    this.onoma = onoma;
    this.epitheto = epitheto ;
    this.dieuthinsi=dieuthinsi;
    this.tilefono = tilefono;
    this.username = username;
    this.password = password;


}
Xristis(String onoma, String epitheto, int tilefono, String dieuthinsi){}

    public Xristis() { }

    public void login() {
        userInstance = this;
    }

    public void logout() {
        userInstance = null;
    }



    public static Xristis getUserInstance() { return getUserInstance(); }

    public static void setUserInstance(Xristis userInstance) { Xristis.setUserInstance(userInstance); }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public String getEpitheto() { return epitheto; }

    public void setEpitheto(String epitheto) { this.epitheto = epitheto; }

    public String getOnoma() { return onoma; }

    public void setOnoma(String onoma) { this.onoma = onoma; }


    public int getTilefono() { return tilefono; }

    public void setTilefono(int tilefono) { this.tilefono = tilefono;}

    public String getDieuthinsi(){ return dieuthinsi; }

    public void setDieuthinsi(String dieuthinsi) { this.dieuthinsi = dieuthinsi; }

    public static List<Xristis> deleteUser(List<Xristis> users, String username) {
        users.removeIf(user -> user.getUsername().equals(username));

        return users;
    }
}





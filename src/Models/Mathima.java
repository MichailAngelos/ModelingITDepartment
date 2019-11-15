package Models;

public class Mathima {
    private int KodikosMathimatos;
    private String Onoma;
    private int Examino;
    private boolean Typos;
    private String Kathigitis;

    public Mathima(int KodikosMathimatos, String Onoma, int Examino, boolean Typos, String Kathigitis) {
        this.KodikosMathimatos = KodikosMathimatos;
        this.Onoma = Onoma;
        this.Examino = Examino;
        this.Typos = Typos;
        this.Kathigitis = Kathigitis;
    }

    public int getKodikosMathimatos() {
        return KodikosMathimatos;
    }

    public void setKodikosMathimatos(int KodikosMathimatos) {
        this.KodikosMathimatos = KodikosMathimatos;
    }

    public String getOnoma() {
        return Onoma;
    }

    public void setOnoma(String Onoma) {
        this.Onoma = Onoma;
    }

    public int getExamino() {
        return Examino;
    }

    public void setExamino(int Examino) {
        this.Examino = Examino;
    }

    public boolean isTypos() {
        return Typos;
    }

    public void setTypos(boolean Typos) {
        this.Typos = Typos;
    }

    public String getKathigitis() {
        return Kathigitis;
    }

    public void setKathigitis(String Kathigitis) {
        this.Kathigitis = Kathigitis;
    }






}

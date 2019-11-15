package Models;

public class Grammatia extends Xristis {

        private int AM;

        public Grammatia(String Onoma,String Epitheto,int Tilefono,String Dieuthinsi, int AM) {
            super(Onoma, Epitheto, Tilefono, Dieuthinsi);
            this.AM = AM;
        }

        public int getAM() {
            return AM;
        }

        public void setAM(int AM) {
            this.AM = AM;
        }

        public void Aitiseis() {


        }

}

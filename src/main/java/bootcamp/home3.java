package bootcamp;

public class home3 {
    public static void main(String[] args) {
        //objek menggunakan constructor
        home2 rumah = new home2();
        //attribute
        rumah.merk = "podomoro";
        rumah.harga = 2000;
        rumah.tambah(  10, 50);
        rumah.printdataatribut();

        //objek
        home2 alfalink = new home2();
        alfalink.merk = "abc" ;
        alfalink.harga = 1000;
        alfalink.printdataatribut();
    }
}

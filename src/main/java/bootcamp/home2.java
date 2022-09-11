package bootcamp;

public class home2 {
    //atribut - globsl variabel
    String merk;
    int harga;


    //methods
    //access_modifier return_value nama (parameter)
    public void tambah(int bila, int bilb){
        //local variabel
        int hasil = bila + bilb;
        System.out.println(hasil);


    }

    public void printdataatribut() {
        System.out.println(merk);
        System.out.println(harga);
    }
}

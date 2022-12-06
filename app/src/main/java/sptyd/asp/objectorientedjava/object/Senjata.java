package sptyd.asp.objectorientedjava.object;

public class Senjata {
    String namaSenjata;
    int jumlahPeluru;

    public String infoSenjata() {
        namaSenjata = "AK 435";
        return namaSenjata;
    }

    public int lihatPeluru() {
        jumlahPeluru = 300;
        return jumlahPeluru;
    }

    public int actionTembak() {
        jumlahPeluru--;
        return jumlahPeluru;
    }

    public int lihatSisaPeluru() {
        return jumlahPeluru;
    }

    public int tambah5Peluru() {
        jumlahPeluru = jumlahPeluru + 5;
        return jumlahPeluru;
    }
}

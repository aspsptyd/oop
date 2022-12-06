package sptyd.asp.objectorientedjava.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import sptyd.asp.objectorientedjava.R;
import sptyd.asp.objectorientedjava.object.Senjata;

public class ShotgunActivity extends AppCompatActivity {

    TextView tvShowInfo;

    Senjata senjata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shotgun);

        senjata = new Senjata();

        tvShowInfo = findViewById(R.id.textShow);
    }

    public void shotGun(View view) {
        int loadPeluru = senjata.actionTembak();
        tvShowInfo.setText("Peluru : " + loadPeluru);
    }

    public void infoDevice(View view) {
        String namaSenjata = senjata.infoSenjata();
        int sisaPeluru = senjata.lihatSisaPeluru();
        tvShowInfo.setText("Senjata : " + namaSenjata + " - Sisa Peluru : " + sisaPeluru);
    }

    public void reloadWeapon(View view) {
        int jumlahPeluru = senjata.lihatPeluru();
        tvShowInfo.setText("Jumlah : " + jumlahPeluru);
    }

    public void buy5(View view) {
        String namaSenjata = senjata.infoSenjata();
        int hasilTambah = senjata.tambah5Peluru();
        tvShowInfo.setText("Senjata : " + namaSenjata + " - Sisa Peluru : " + hasilTambah);
    }
}
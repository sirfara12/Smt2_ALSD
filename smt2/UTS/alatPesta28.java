package UTS;

import java.util.Arrays;
import java.util.Scanner;

class AlatPesta {
    private String nama28;
    private int harga28;
    private int stok28;

    public AlatPesta(String nama, int harga, int stok) {
        this.nama28 = nama;
        this.harga28 = harga;
        this.stok28 = stok;
    }

    public String getNama() {
        return nama28;
    }

    public int getHarga() {
        return harga28;
    }

    public int getStok() {
        return stok28;
    }

    @Override
    public String toString() {
        return "Alat Pesta{" +
                "Nama='" + nama28 + '\'' +
                ", Harga=" + harga28 +
                ", Stok=" + stok28 +
                '}';
    }
}

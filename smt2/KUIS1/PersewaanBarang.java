package KUIS1;
public class PersewaanBarang {
    private String nama;
    private double hargaSewaPerHari;
    private int jumlahStok;

    public PersewaanBarang(String nama, double hargaSewaPerHari, int jumlahStok) {
        this.nama = nama;
        this.hargaSewaPerHari = hargaSewaPerHari;
        this.jumlahStok = jumlahStok;
    }

    public String getNama() {
        return nama;
    }

    public double getHargaSewaPerHari() {
        return hargaSewaPerHari;
    }

    public int getJumlahStok() {
        return jumlahStok;
    }

    public void tambahStok(int jumlah) {
        jumlahStok += jumlah;
    }

    public void kurangiStok(int jumlah) {
        if (jumlahStok >= jumlah) {
            jumlahStok -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi.");
        }
    }

    public double totalHargaSewa(int hari) {
        return hargaSewaPerHari * hari;
    }

}
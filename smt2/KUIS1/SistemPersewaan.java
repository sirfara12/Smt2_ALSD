package KUIS1;
import java.util.Date;
import java.util.Scanner;

class Barang {
    private String nama;
    private double harga;
    private boolean tersedia;

    public Barang(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
        this.tersedia = true;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
}

class Penyewa {
    private String nama;
    private String alamat;
    private String nomorTelepon;

    public Penyewa(String nama, String alamat, String nomorTelepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }
}

class Penyewaan {
    private Penyewa penyewa;
    private Barang barang;
    private Date tanggalPinjam;
    private Date tanggalKembali;

    public Penyewaan(Penyewa penyewa, Barang barang, Date tanggalPinjam, Date tanggalKembali) {
        this.penyewa = penyewa;
        this.barang = barang;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    public Penyewa getPenyewa() {
        return penyewa;
    }

    public Barang getBarang() {
        return barang;
    }

    public Date getTanggalPinjam() {
        return tanggalPinjam;
    }

    public Date getTanggalKembali() {
        return tanggalKembali;
    }
}

public class SistemPersewaan{
    private Barang[] daftarBarang;
    private Penyewaan[] daftarPenyewaan;
    private int jumlahBarang;
    private int jumlahPenyewaan;

    public SistemPersewaan(int maxBarang, int maxPenyewaan) {
        daftarBarang = new Barang[maxBarang];
        daftarPenyewaan = new Penyewaan[maxPenyewaan];
        jumlahBarang = 0;
        jumlahPenyewaan = 0;
    }

    public void tambahBarang(Barang barang) {
        if (jumlahBarang < daftarBarang.length) {
            daftarBarang[jumlahBarang] = barang;
            jumlahBarang++;
            System.out.println("Barang berhasil ditambahkan.");
        } else {
            System.out.println("Daftar barang sudah penuh.");
        }
    }

    public void sewaBarang(Penyewa penyewa, Barang barang, Date tanggalPinjam, Date tanggalKembali) {
        if (!barang.isTersedia()) {
            System.out.println("Maaf, barang tidak tersedia untuk disewa saat ini.");
            return;
        }

        if (jumlahPenyewaan < daftarPenyewaan.length) {
            Penyewaan penyewaan = new Penyewaan(penyewa, barang, tanggalPinjam, tanggalKembali);
            daftarPenyewaan[jumlahPenyewaan] = penyewaan;
            jumlahPenyewaan++;
            barang.setTersedia(false);
            System.out.println("Barang berhasil disewa oleh " + penyewa.getNama());
        } else {
            System.out.println("Daftar penyewaan sudah penuh.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nama barang:");
        String namaBarang = scanner.nextLine();

        System.out.println("Masukkan harga barang:");
        double hargaBarang = scanner.nextDouble();

        Barang barang1 = new Barang(namaBarang, hargaBarang);

        SistemPersewaan sistemPersewaan = new SistemPersewaan(10, 10);

        sistemPersewaan.tambahBarang(barang1);

        Penyewa penyewa1 = new Penyewa("ABIL", "Jl. Raya Bnadung", "083841757898");

        Date tanggalPinjam = new Date();
        Date tanggalKembali = new Date(tanggalPinjam.getTime() + 7 * 24 * 60 * 60 * 1000); // 7 hari setelah tanggal pinjam

        sistemPersewaan.sewaBarang(penyewa1, barang1, tanggalPinjam, tanggalKembali);

        scanner.close();
    }
}
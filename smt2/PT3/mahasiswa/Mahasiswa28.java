package PT3.mahasiswa;

public class Mahasiswa28 {
    String nama;
    String nim;
    char jenisKelamin;
    double ipk;

    Mahasiswa28(String nama, String nim, char jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("IPK: " + ipk);
    }

    double getIPK() {
        return ipk;
    }
}
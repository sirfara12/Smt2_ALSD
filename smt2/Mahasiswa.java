import java.util.Scanner;

public class Mahasiswa {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    MahasiswaData[] mahasiswa = new MahasiswaData[3];
    for (int i = 0; i < mahasiswa.length; i++) {
      System.out.println("Masukkan data Mahasiswa " + (i + 1) + ":");
      System.out.print("Masukkan Nama: ");
      String nama = scanner.nextLine();
      System.out.print("Masukkan NIM: ");
      String nim = scanner.nextLine();
      System.out.print("Masukkan Jenis Kelamin (L/P): ");
      char jenisKelamin = scanner.nextLine().charAt(0);
      System.out.print("Masukkan IPK: ");
      double ipk = scanner.nextDouble();
      scanner.nextLine(); // Consume remaining newline character

      mahasiswa[i] = new MahasiswaData(nama, nim, jenisKelamin, ipk);
    }

    tampilkanDataMahasiswa(mahasiswa);

    double rataRataIPK = hitungRataRataIPK(mahasiswa);
    System.out.println("\nRata-rata IPK: " + rataRataIPK);

    MahasiswaData mahasiswaIPKTerbesar = temukanMahasiswaIPKTerbesar(mahasiswa);
    System.out.println("\nMahasiswa dengan IPK terbesar: " + mahasiswaIPKTerbesar.getNama() + " (" + mahasiswaIPKTerbesar.getNim() + ") - IPK: " + mahasiswaIPKTerbesar.getIpk());
  }

  public static void tampilkanDataMahasiswa(MahasiswaData[] mahasiswa) {
    System.out.println("Daftar Mahasiswa:");
    for (int i = 0; i < mahasiswa.length; i++) {
      MahasiswaData m = mahasiswa[i];
      System.out.printf("- %d. %s (%s) - %c - IPK: %.2f\n", (i + 1), m.getNama(), m.getNim(), m.getJenisKelamin(), m.getIpk());
    }
  }

  public static double hitungRataRataIPK(MahasiswaData[] mahasiswa) {
    double totalIPK = 0;
    for (MahasiswaData m : mahasiswa) {
      totalIPK += m.getIpk();
    }
    return totalIPK / mahasiswa.length;
  }

  public static MahasiswaData temukanMahasiswaIPKTerbesar(MahasiswaData[] mahasiswa) {
    MahasiswaData mahasiswaIPKTerbesar = mahasiswa[0];
    for (MahasiswaData m : mahasiswa) {
      if (m.getIpk() > mahasiswaIPKTerbesar.getIpk()) {
        mahasiswaIPKTerbesar = m;
      }
    }
    return mahasiswaIPKTerbesar;
  }
}

class MahasiswaData {
  private String nama;
  private String nim;
  private char jenisKelamin;
  private double ipk;

  public MahasiswaData(String nama, String nim, char jenisKelamin, double ipk) {
    this.nama = nama;
    this.nim = nim;
    this.jenisKelamin = jenisKelamin;
    this.ipk = ipk;
  }

  public String getNama() {
    return nama;
  }

  public String getNim() {
    return nim;
  }

  public char getJenisKelamin() {
    return jenisKelamin;
  }

  public double getIpk() {
    return ipk;
  }
}
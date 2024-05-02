package PT8.Stack;
import java.util.Scanner;
public class Utama28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan kapasitas gudang: ");
        int kapasitasGudang = sc.nextInt();
        Gudang28 gudang = new Gudang28(7);
        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan Tumpukan Barang");
            System.out.println("4. Tampilkan Barang Teratas");
            System.out.println("5. Tampilkan Barang Terbawah");
            System.out.println("6. Cari Barang");
            System.out.println("7. Keluar");
            System.out.print("Pilih Operasi: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

        switch (pilihan) {
            case 1:
            System.out.print("Masukkan kode barang: ");
            int kode = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan nama barang: ");
            String nama = sc.nextLine();
            System.out.print("masukkan nama kategori: " );
            String kategori = sc.nextLine();
            Barang28 barangBaru = new Barang28(kode, nama, kategori);
            gudang.tambahBarang(barangBaru);
                 break;

            case 2:
            gudang.ambilBarang();
            break;

            case 3:
            gudang.lihatBarangTeratas();
            break;
            
            case 4: 
            gudang.tampilkanBarang();
            break;

            case 5: 
            gudang.lihatBarangTerbawah();
            break;

            case 6:
                    System.out.print("Masukkann kode barang yang dicari:");
                    kode = sc.nextInt();
                    sc.nextLine();
                    gudang.cariBarang(kode);
                    break;

                case 7:
                    System.exit(0);

            default: 
            System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
                
        }

        
        }
    }
}
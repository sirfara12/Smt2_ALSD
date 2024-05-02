package PT6.Sorting;

public class Main {
    public static void main(String[] args) {
        DaftarMahasiswaBerpretasi List = new DaftarMahasiswaBerpretasi();
        Mahasiswa m1 = new Mahasiswa("Nusa", 2017, 25, 3);
        Mahasiswa m2 = new Mahasiswa("Rara", 2012, 19, 4);
        Mahasiswa m3 = new Mahasiswa("Dompu", 2018, 19, 3.5);
        Mahasiswa m4 = new Mahasiswa("Abdul", 2017, 23, 2);
        Mahasiswa m5 = new Mahasiswa("ummi", 2019, 21, 3.75);

        
        List.tambah(m1);
        List.tambah(m2);
        List.tambah(m3);
        List.tambah(m4);
        List.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        List.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        List.bubbleSort();
        List.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        List.selectionSort();
        List.tampil();

        //System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        //List.insertionSort();
       // List.tampil();


        System.out.println();
        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk (menggunakan Insertion Short)");
        List.insertionSort(true);
        List.tampil();

        System.out.println();
        System.out.println("Data mahasiswa setelah sorting dsc berdasarkan ipk (menggunakan Insertion Short)");
        List.insertionSort(false);
        List.tampil();
    }
}

package PT6.Sorting;

public class MainHotel {
    public static void main(String[] args) {
        HotelService service = new HotelService();
        // Tambahkan data hotel
        service.tambah(new Hotel("Hotel Ascent primer", "Gadingan", 100000, (byte) 3));
        service.tambah(new Hotel("Hotel Daroessalam", "Pasuruan", 2000000, (byte) 5));
        service.tambah(new Hotel("Hotel BJ Perdana", "tamanan", 1500000, (byte) 2));
        System.out.println("Data Hotel sebelum sorting:");
        service.tampilAll();
        // Sorting menggunakan bubble sort
        System.out.println("\nData Hotel setelah asd sorting menggunakan  Bubble Sort berdasarkan harga:");
        service.bubbleSort();
        service.tampilAll();
        // Sorting menggunakan selection sort
        System.out.println("\nData Hotel setelah dsc sorting menggunakan Selection Sort berdasarkan rating bintang:");
        service.selectionSort();
        service.tampilAll();
    }
}

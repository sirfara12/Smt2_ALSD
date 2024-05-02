package PT10.Prakk2.tugas;
import java.util.Scanner;


public class QueueMain28 {

    public static void menu() {
        System.out.println("masukkan operasi yang diinginkan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("--------------------------------------");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("masukkan kapasitas queue: ");
        int n = sc.nextInt();

        Queue28 Q = new Queue28(n);

        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                
                case 2:
                    try {
                        int dataKeluar = Q.Dequeue();
                        System.out.println("data yang dikeluarkan: " + dataKeluar);
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                
                case 3: 
                    Q.print();
                    break;
                
                case 4: 
                    Q.peek();
                    break;
                
                case 5: 
                    Q.clear();
                    break;
            } 
        } while  (pilih >= 1 && pilih <= 5);
    }
}

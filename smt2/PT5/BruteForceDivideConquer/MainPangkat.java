package PT5.BruteForceDivideConquer;
import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pangkat[]png = new Pangkat[5];
        png[0] = new Pangkat(5, 2); 
        png[1] = new Pangkat(10, 2); 
        png[2] = new Pangkat(15, 4); 
        png[3] = new Pangkat(20, 2); 
        png[4] = new Pangkat(25, 2); 

        System.out.println("===========================================");
        System.out.println("                Menu Pangkat               ");
        System.out.println("========================================== ");
        System.out.println("1. Menggunakan Brute Force ");
        System.out.println("2. Menggunakan Devide Conquer ");
        System.out.println("3. exit ");
        System.out.print("Silahkan Pilih Metode Perhitungan : ");
        int pilih = input.nextInt();

        switch(pilih){
            case 1 :
            System.out.println("============================================");
            System.out.println("Hasil pangkat dengan Brute force ");     
            for(int i=0; i<png.length; i++){
                System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
            }
            break;
            case 2 :
            System.out.println("============================================");
            System.out.println("Hasil pangkat dengan Devide Conquer ");
            for(int i=0; i<png.length; i++){
                System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatDC(png[i].nilai,png[i].pangkat));
            }
            break;
            case 3 :
            System.out.println("------------Terima Kasih---------");
            break;
            default :
            System.out.println("------ input yang anda masukkan salah -------");
        }
    }
}

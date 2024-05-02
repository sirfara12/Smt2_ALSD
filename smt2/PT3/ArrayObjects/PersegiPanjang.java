package PT3.ArrayObjects;
import java.util.Scanner;

public class PersegiPanjang {
    public int panjang;
    public int lebar;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukan panjang array: ");
        int n = sc.nextInt();

        PersegiPanjang[] ppArray = new PersegiPanjang[3];

        for(int i = 0; i < 3; i++){
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for(int i = 0; i < 3; i++) {
            System.out.println("persegi panjang ke-" + i);
            System.out.println("panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
   
    }

}
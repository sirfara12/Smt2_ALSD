package PT5.BruteForceDivideConquer;
import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("------------");
    System.out.println("masukkan jumlah elemen: ");
    int ijml = sc.nextInt();

    Faktorial[] fk = new Faktorial[ijml];
    for(int i=0; i < ijml; i++){
        fk[i] = new Faktorial();
        System.out.println("masukkan nilai data ke- " +(i+i)+":");
        int nilai =sc.nextInt();
        fk[i].nilai = nilai;
    }
    System.out.println("HASIL - BRUTE FORCE");
    for(int i = 0; i < ijml; i++) {
        System.out.println("Hasil perhitungan faktorial menggunakan Brute force adalah " + fk[i].FaktorialBF(fk[i].nilai));
    } 
    System.out.println("HASIL - DIVIDE AND CONQUER");
    for(int i =  0; i < ijml; i++){
        System.out.println("hasil perhitungan faktorial menggunakan divide and conquer adalah" + fk[i].FaktorialDC(fk[i].nilai));
    }
}
}

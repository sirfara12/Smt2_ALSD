package PT5.BruteForceDivideConquer;

public class MainMobil {
        public static void main(String[] args) {
    
            Mobil[] mobil = {
                new Mobil("BMW", "M2 Coupe", 2016, 6816, 728),
                new Mobil("Ford", "Fiesta ST", 2014, 3921, 575),
                new Mobil("Nissan", "370Z", 2009, 4360, 657),
                // Add more mobil objects as needed
            };
    
            // Hitung rata-rata top power (Brute Force)
            double totalPower = 0;
            for (Mobil m : mobil) {
                totalPower += m.getTopPower();
            }
            double averagePower = totalPower / mobil.length;
    
            // Mencari top acceleration tertinggi (Divide and Conquer)
            Mobil mobilTercepat = findMobilTercepat(mobil, 0, mobil.length - 1);
    
            System.out.println("Rata-rata top power seluruh mobil: " + averagePower);
            System.out.println("\nMobil dengan top acceleration tertinggi:");
            System.out.println("Merk: " + mobilTercepat.getMerk());
            System.out.println("Tipe: " + mobilTercepat.getTipe());
            System.out.println("Top Acceleration: " + mobilTercepat.getTopAcceleration());
        }
    
        private static Mobil findMobilTercepat(Mobil[] mobil, int low, int high) {
            if (low == high) {
                return mobil[low];
            }
    
            int mid = (low + high) / 2;
            Mobil kiriTercepat = findMobilTercepat(mobil, low, mid);
            Mobil kananTercepat = findMobilTercepat(mobil, mid + 1, high);
    
            if (kiriTercepat.getTopAcceleration() > kananTercepat.getTopAcceleration()) {
                return kiriTercepat;
            } else {
                return kananTercepat;
            }
        }
    }
    
package UTS;
import java.util.Scanner;
import java.util.Arrays;

public class Main28 {
        public static void main(String[] args) {
            AlatPesta[] inventory = {
                    new AlatPesta("Meja", 100, 10),
                    new AlatPesta("Kursi", 50, 20),
                    new AlatPesta("Tenda", 200, 5)
            };
    
            Scanner scanner = new Scanner(System.in);
    
            int choice;
            do {
                System.out.println("Menu:");
                System.out.println("1. Tampilkan deret data berdasarkan harga (Ascending)");
                System.out.println("2. Tampilkan deret data berdasarkan stok (Descending)");
                System.out.println("3. Cari alat pesta berdasarkan nama");
                System.out.println("4. Pesan alat pesta");
                System.out.println("0. Keluar");
                System.out.print("Pilihan Anda: ");
                choice = scanner.nextInt();
    
                switch (choice) {
                    case 1:
                        sortByPrice(inventory);
                        displayInventory(inventory);
                        break;
                        case 2:
                        sortByStock(inventory);
                        displayInventory(inventory);
                        break;
                    case 3:
                        scanner.nextLine(); // Consume newline
                        System.out.print("Masukkan nama alat pesta yang ingin dicari: ");
                        String searchName = scanner.nextLine();
                        searchInventory(inventory, searchName);
                        break;
                    case 4:
                        scanner.nextLine(); // Consume newline
                        System.out.print("Masukkan nama Anda: ");
                        String customerName = scanner.nextLine();
                        System.out.print("Berapa banyak alat pesta yang ingin dipesan? ");
                        int numItems = scanner.nextInt();
                        AlatPesta[] selectedItems = new AlatPesta[numItems];
                        scanner.nextLine(); // Consume newline
                        for (int i = 0; i < numItems; i++) {
                            System.out.print("Masukkan nama alat pesta ke-" + (i + 1) + ": ");
                            String itemName = scanner.nextLine();
                            selectedItems[i] = findItemByName(inventory, itemName);
                            if (selectedItems[i] == null) {
                                System.out.println("Alat pesta '" + itemName + "' tidak ditemukan.");
                                break;
                            }
                        }
                        if (selectedItems[0] != null) {
                            int totalCost = calculateTotalCost(selectedItems);
                            Booking28 booking = new Booking28(customerName, selectedItems, totalCost);
                            System.out.println("Pemesanan berhasil!");
                            System.out.println("Detail Pemesanan:");
                            System.out.println(booking);
                        }
                        break;
                    case 0:
                        System.out.println("Terima kasih!");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            } while (choice != 0);
        
    }

    private static void sortByPrice(AlatPesta[] inventory) {
        for (int i = 0; i < inventory.length - 1; i++) {
            for (int j = 0; j < inventory.length - i - 1; j++) {
                if (inventory[j].getHarga() > inventory[j + 1].getHarga()) {
                    AlatPesta temp = inventory[j];
                    inventory[j] = inventory[j + 1];
                    inventory[j + 1] = temp;
                }
            }
        }
    }
    private static void sortByStock(AlatPesta[] inventory) {
        for (int i = 0; i < inventory.length - 1; i++) {
            for (int j = 0; j < inventory.length - i - 1; j++) {
                if (inventory[j].getStok() < inventory[j + 1].getStok()) {
                    AlatPesta temp = inventory[j];
                    inventory[j] = inventory[j + 1];
                    inventory[j + 1] = temp;
                }
            }
        }
    }

    private static void displayInventory(AlatPesta[] inventory) {
        System.out.println("Daftar Alat Pesta:");
        for (AlatPesta item : inventory) {
            System.out.println(item);
        }
    }
    private static void searchInventory(AlatPesta[] inventory, String searchName) {
        boolean found = false;
        for (AlatPesta item : inventory) {
            if (item.getNama().equalsIgnoreCase(searchName)) {
                System.out.println("Alat Pesta ditemukan: " + item);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Alat Pesta tidak ditemukan.");
        }
    }
    private static AlatPesta findItemByName(AlatPesta[] inventory, String itemName) {
        for (AlatPesta item : inventory) {
            if (item.getNama().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null; // Return null if item not found
    }

    private static int calculateTotalCost(AlatPesta[] items) {
        int totalCost = 0;
        for (AlatPesta item : items) {
            totalCost += item.getHarga();
        }
        return totalCost;
    
    }
}

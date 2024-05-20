package aplikasiinputbarang;

import java.util.Scanner;

/**
 *
 * @author Ni Kadek Juni Antari
 * NIM: 2201010172
 */
public class AplikasiInputBarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        InventoriManager manager = new InventoriManager(10);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan Barang");
            System.out.println("3. Ubah Barang");
            System.out.println("4. Hapus Barang");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // membersihkan newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan harga barang: ");
                    double harga = scanner.nextDouble();
                    System.out.print("Masukkan jumlah barang: ");
                    int jumlah = scanner.nextInt();
                    manager.tambahBarang(new Barang(nama, harga, jumlah));
                    System.out.println("Barang ditambahkan.");
                    break;
                case 2:
                    System.out.println("Daftar Barang:");
                    manager.tampilkanBarang();
                    break;
                case 3:
                    System.out.print("Masukkan nomor barang yang ingin diubah: ");
                    int indexUbah = scanner.nextInt();
                    scanner.nextLine(); // membersihkan newline
                    System.out.print("Masukkan nama baru: ");
                    String namaBaru = scanner.nextLine();
                    System.out.print("Masukkan harga baru: ");
                    double hargaBaru = scanner.nextDouble();
                    System.out.print("Masukkan jumlah baru: ");
                    int jumlahBaru = scanner.nextInt();
                    manager.ubahBarang(indexUbah, new Barang(namaBaru, hargaBaru, jumlahBaru));
                    System.out.println("Barang diubah.");
                    break;
                case 4:
                    System.out.print("Masukkan nomor barang yang ingin dihapus: ");
                    int indexHapus = scanner.nextInt();
                    scanner.nextLine(); // membersihkan newline
                    manager.hapusBarang(indexHapus);
                    System.out.println("Barang dihapus.");
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}

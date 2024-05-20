package aplikasiinputbarang;

/**
 *
 * @author LENOVO
 */
public class InventoriManager {
    private Barang[] barangArray;
    private int jumlahBarang;

    public InventoriManager(int maxSize) {
        barangArray = new Barang[maxSize];
        jumlahBarang = 0;
    }

    public void tambahBarang(Barang barang) {
        barangArray[jumlahBarang] = barang;
        jumlahBarang++;
    }

    public void tampilkanBarang() {
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println("Nama: " + barangArray[i].getNama());
            System.out.println("Harga: " + barangArray[i].getHarga());
            System.out.println("Jumlah: " + barangArray[i].getJumlah());
            System.out.println();
        }
    }

    public void ubahBarang(int index, Barang barangBaru) {
        if (index >= 0 && index < jumlahBarang) {
            barangArray[index] = barangBaru;
        } else {
            System.out.println("Index tidak valid.");
        }
    }

    public void hapusBarang(int index) {
        if (index >= 0 && index < jumlahBarang) {
            for (int i = index; i < jumlahBarang - 1; i++) {
                barangArray[i] = barangArray[i + 1];
            }
            jumlahBarang--;
        } else {
            System.out.println("Index tidak valid.");
        }
    }
}


    


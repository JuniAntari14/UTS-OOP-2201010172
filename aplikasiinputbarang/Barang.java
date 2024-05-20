
package aplikasiinputbarang;

/**
 *
 * @author Ni Kadek Juni Antari
 * NIM: 2201010172
 */
public class Barang {
    private String nama;
    private double harga;
    private int jumlah;

    public Barang(String nama, double harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}



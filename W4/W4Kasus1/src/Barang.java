public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;
    public Barang(String kode, String nama) {
        kode_barang = kode;
        nama_barang = nama;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok += stok;
    }
}

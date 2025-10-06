package percobaan6;

abstract class Kendaraan {
    String merk;
    int tahunProduksi;

    public Kendaraan(String merk, int tahunProduksi) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }

    abstract void jalankan();

    void info() {
        System.out.println("Merk\t\t: " + merk);
        System.out.println("Tahun Produksi\t: " + tahunProduksi);
    }
}

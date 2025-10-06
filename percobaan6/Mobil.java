package percobaan6;

public class Mobil extends Kendaraan {
    int jumlahPintu;

    public Mobil(String merk, int tahunProduksi, int jumlahPintu) {
        super(merk, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    void jalankan() {
        System.out.println("Mobil " + merk + " tahun " + tahunProduksi + " dengan " + jumlahPintu + " pintu sedang berjalan.");
    }

    void info(){
        super.info();
        System.out.println("Jumlah Pintu\t: " + jumlahPintu);
    }
}

package percobaan6;

public class Pesawat extends Kendaraan {
    int jumlahMesin;

    public Pesawat(String merk, int tahunProduksi, int jumlahMesin) {
        super(merk, tahunProduksi);
        this.jumlahMesin = jumlahMesin;
    }

    @Override
    void jalankan() {
        System.out.println("Pesawat sedang terbang...");
    }

    void info() {
        super.info();
        System.out.println("Jumlah Mesin\t: " + jumlahMesin);
    }
    
}

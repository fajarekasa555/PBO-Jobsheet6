package percobaan6;

public class Motor extends Kendaraan {
    int kapasitasCC;

    public Motor(String merk, int tahunProduksi, int kapasitasCC) {
        super(merk, tahunProduksi);
        this.kapasitasCC = kapasitasCC;
    }

    @Override
    void jalankan() {
        System.out.println("Motor " + merk + " tahun " + tahunProduksi + " dengan kapasitas " + kapasitasCC + " CC sedang berjalan.");
    }

    void info(){
        super.info();
        System.out.println("Kapasitas CC\t: " + kapasitasCC);
    }
}

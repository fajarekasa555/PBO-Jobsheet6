package percobaan5;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("nugroho", 3, "hijau");

        kucing.info();
        kucing.berjalan();
        // System.out.println(kucing.nama);
        System.out.println(kucing.umur);

        Anjing anjing = new Anjing("sutrisno", 5, "bulldog");

        anjing.info();
        anjing.berjalan();
        System.out.println(anjing.getRas());
    }
}

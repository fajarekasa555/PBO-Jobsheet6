package percobaan6;

public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", 2001, 2);
        Motor motor = new Motor("Yamaha", 2021, 120);
        Pesawat pesawat = new Pesawat("Boeing", 2018, 10);

        mobil.info();
        mobil.jalankan();

        System.out.println("-----------");

        motor.info();
        motor.jalankan();

        System.out.println("-----------");

        pesawat.info();
        pesawat.jalankan();
    }
}

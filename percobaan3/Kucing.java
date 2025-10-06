package percobaan3;

public class Kucing extends Hewan {
    String ras;

    public Kucing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
        System.out.println("Konstruktor kucing dipanggil");
    }
}

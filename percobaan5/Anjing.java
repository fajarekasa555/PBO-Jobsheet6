package percobaan5;

public class Anjing extends Hewan {
    private String ras;

    public Anjing(String nama, int umur, String ras){
        super(nama, umur);
        this.ras = ras;
    }

    public String getRas(){
        return ras;
    }

    public void info(){
        super.info();
        System.out.println("Ras\t: " + ras);
    }
}

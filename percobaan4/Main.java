package percobaan4;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("nugroho", 3);
        Anjing anjing = new Anjing("ultra milk", 4);
        kucing.mengeong();
        kucing.menyusui();
        System.out.println("\n");
        anjing.menggonggong();
        anjing.menyusui();
    }
}

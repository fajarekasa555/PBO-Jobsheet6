public class Main {
    public static void main(String[] args) {
        Kucing cat = new Kucing("Kitty");
        Anjing dog = new Anjing("Doggy");

        cat.bersuara();
        cat.mengeong();

        System.out.println();

        dog.bersuara();
        dog.menggonggong();
    }
}

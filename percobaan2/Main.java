package percobaan2;

public class Main {
    public static void main(String[] args) {
        Anjing dog = new Anjing("Doggy");
        Kucing cat = new Kucing("Kitty");

        dog.menggonggong();

        System.out.println();

        cat.mengeong();
    }

}

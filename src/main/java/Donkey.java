public class Donkey implements Tradable, Domesticatable{

    private int price;
    private String sound;

    public Donkey(int price, String sound) {
        this.price = price;
        this.sound = sound;
    }

    @Override
    public String sound() {
        return this.sound;
    }
}

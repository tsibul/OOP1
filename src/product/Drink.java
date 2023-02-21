package product;

public class Drink extends Product {
    private float volume;

    public Drink(String name, float price, float volume) {
        super(name, price);
        this.volume = volume;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }
}

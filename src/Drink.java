public class Drink extends Product {
    private float volume;

    Drink(String name, float price, float volume) {
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

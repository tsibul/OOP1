public class HotDrink extends Drink{

    private int temperature;

    HotDrink(String name, float price, float volume, int tmpr) {
        super(name, price, volume);
        this.temperature = tmpr;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}

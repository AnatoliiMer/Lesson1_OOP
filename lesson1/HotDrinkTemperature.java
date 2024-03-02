package lesson1;

class HotDrinkTemperature extends HotDrink {
    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public HotDrinkTemperature(int name, int volume, int temperature) { 
        super(name, volume, temperature);
        this.temperature = temperature;
    }
    @Override
    public String toString() {
        return "Hot Drink: " + getName() + ", Volume: " + getVolume() + ", Temperature: " + temperature;
    }

   
}

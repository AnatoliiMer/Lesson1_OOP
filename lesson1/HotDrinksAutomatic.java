package lesson1;

class HotDrinksAutomatic implements VendingMachine {
    @Override
    public HotDrink getProduct(int name, int volume, int temperature) {
        return new HotDrinkTemperature(name, volume, temperature);
    }
}

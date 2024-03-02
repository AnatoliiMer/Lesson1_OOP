package lesson1;

public class Main {
    public static void main(String[] args) {
        // Создание нескольких горячих напитков
        HotDrinkTemperature drink1 = new HotDrinkTemperature(1, 200, 80);
        HotDrinkTemperature drink2 = new HotDrinkTemperature(2, 300, 70);

        // Создание автомата горячих напитков
        HotDrinksAutomatic automatic = new HotDrinksAutomatic();

        // Получение продукта с помощью автомата
        HotDrink resultingDrink = automatic.getProduct(1, 200, 80);

        // Воспроизведение логики программы
        System.out.println("Полученный напиток: " + resultingDrink);
        System.out.println("Выбранный горячий напиток: " + drink1);
        System.out.println("Выбранный горячий напиток: " + drink2);
    }
}

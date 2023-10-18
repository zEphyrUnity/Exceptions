package oop.seminar1;

// Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
// Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод
// getProduct(string name, double volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
// В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику,
// заложенную в программе.
// Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BottleOfWatter b1 = new BottleOfWatter("1", 1, 1);
        BottleOfWatter b2 = new BottleOfWatter("2", 2, 2);
        BottleOfWatter b3 = new BottleOfWatter("5", 4, 3);
        BottleOfWatter b4 = new BottleOfWatter("15", 123, 1);
        BottleOfWatter b5 = new BottleOfWatter("20", 6, 5);

        HotDrink coffee1 = new HotDrink("Lаvаzzа Suреr Сrеmа", 120, 200, 90);
        HotDrink coffee2 = new HotDrink("Lаvаzzа Gоld Sеlесtiоn", 100, 200, 90);
        HotDrink coffee3 = new HotDrink("Lаvаzzа Тiеrrа Соlоmbiа", 150, 200, 90);

        HotDrink tea1 = new HotDrink("Green", 70, 200, 95);
        HotDrink tea2 = new HotDrink("Black", 50, 200, 95);
        HotDrink tea3 = new HotDrink("Earl Grey", 100, 200, 95);

        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine(new ArrayList<>());
        vendingMachine.addBottleOfWater(b1);
        vendingMachine.addBottleOfWater(b2);
        vendingMachine.addBottleOfWater(b3);
        vendingMachine.addBottleOfWater(b4);
        vendingMachine.addBottleOfWater(b5);

        HotDrinksVendingMachine hotDrinksVendingMachine = new HotDrinksVendingMachine(new ArrayList<>());
        hotDrinksVendingMachine.addHotDrink(coffee1);
        hotDrinksVendingMachine.addHotDrink(coffee2);
        hotDrinksVendingMachine.addHotDrink(coffee3);

        hotDrinksVendingMachine.addHotDrink(tea1);
        hotDrinksVendingMachine.addHotDrink(tea2);
        hotDrinksVendingMachine.addHotDrink(tea3);

        System.out.println(vendingMachine.getProduct("20", 5));
        System.out.println(vendingMachine.getProduct("20", 100));

        System.out.println(hotDrinksVendingMachine.getProduct("Lаvаzzа Suреr Сrеmа", 200, 90));
        System.out.println(hotDrinksVendingMachine.getProduct("Lаvаzzа Suреr Сrеmа", 100, 100));

//        for (BottleOfWatter b : vendingMachine.getBottleOfWatters()) {
//            System.out.println(b);
//        }
    }

}
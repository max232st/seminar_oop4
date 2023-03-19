package oop.example.seminar4.hw1;

import java.math.BigDecimal;

/**
 * Класс горячих напитков
 */
public class HotDrinks extends Drinkables {
    private int temp;

    public HotDrinks(String name, BigDecimal price, Double volume, int temp) {
        super(name, price, volume);
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }


    @Override
    public String toString() {
        return super.toString() + "температура напитка = " + temp;
    }
}
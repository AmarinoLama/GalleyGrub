package edu.badpals.galleygrub.items;

import java.util.HashMap;
import java.util.Map;

public class RetailPrice {
    static Map<String, Double> prices = new HashMap<>();

    public RetailPrice() {
    }

    public static void init_prices() {
        prices.put("cheese", 0.25);
        prices.put("sauce", 0.5);
        prices.put("medium", 0.25);
        prices.put("large", 0.5);
    }

    public static void display() {
        RetailPrice objeto = new RetailPrice();
        System.out.println(objeto);
    }

    public String toString() {
        StringBuilder salida = new StringBuilder();
        for (Map.Entry<String, Double> price : prices.entrySet()) {
            salida.append(price.getKey())
                    .append("=")
                    .append(price.getValue())
                    .append("\n");
        };
        return salida.toString();
    }
}

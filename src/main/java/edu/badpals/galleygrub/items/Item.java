package edu.badpals.galleygrub.items;

public class Item implements Product{

    String name;
    Double price;
    String extra;

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Item(String name, Double price, String extra) {
        this.name = name;
        this.price = price;
        this.extra = extra;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public Double price() {
        return price;
    }

    @Override
    public String extra() {
        return extra;
    }

    @Override
    public Boolean isRegular() {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder salida = new StringBuilder();
        salida.append(name())
                .append("....")
                .append(price())
                .append("$");
        return salida.toString();
    }
}

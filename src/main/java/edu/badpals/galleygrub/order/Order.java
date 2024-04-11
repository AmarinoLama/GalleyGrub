package edu.badpals.galleygrub.order;

import edu.badpals.galleygrub.items.Item;

import java.util.List;

public class Order implements Comanda {
    @Override
    public void addItem(String name, double price) {

    }

    @Override
    public void addItem(String name, double price, String extra) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public List<Item> itemList() {
        return null;
    }

    @Override
    public Double getTotal() {
        return null;
    }

    @Override
    public void updateTotal(Double total) {

    }

    @Override
    public void display() {

    }
}

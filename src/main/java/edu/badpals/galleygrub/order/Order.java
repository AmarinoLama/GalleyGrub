package edu.badpals.galleygrub.order;

import edu.badpals.galleygrub.items.Item;
import edu.badpals.galleygrub.items.ItemFactory;

import java.util.ArrayList;
import java.util.List;

public class Order implements Comanda {

    private Double total = 0d;
    private List<Item> items = new ArrayList<>();

    @Override
    public void addItem(String name, double price) {
        items.add(ItemFactory.getItem(name, price));
    }

    @Override
    public void addItem(String name, double price, String extra) {
        items.add(ItemFactory.getItem(name, price, extra));
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public List<Item> itemList() {
        return items;
    }

    @Override
    public Double getTotal() {
        return total;
    }

    @Override
    public void updateTotal(Double total) {
        this.total = total;
    }

    @Override
    public void display() {
        System.out.print("\n\t --- ORDER ---  \n");
        for (Item item: items) {
            System.out.println("\t" + item.toString());
        }
    }
}

package edu.badpals.galleygrub.items;

import java.util.HashMap;

public class ItemFactory {
    private static HashMap<String, Item> itemMap = new HashMap<>();

    public ItemFactory() {
    }

    public static Item getItem(String name, double price) {
        if (!itemMap.containsKey(name)){
            itemMap.put(name, new Item(name, price));}
        return itemMap.get(name);
    }

    public static Item getItem(String name, double price, String extra) {
        String key = name + extra;
        if (!itemMap.containsKey(key)){
            itemMap.put(name + extra, new Item(name, price, extra));}
        return itemMap.get(key);
    }


    public static int size() {
        return itemMap.size();
    }

    public static void clear() {
        itemMap.clear();
    }
}

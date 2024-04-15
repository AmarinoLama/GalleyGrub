package edu.badpals.galleygrub.extras;

import edu.badpals.galleygrub.items.Item;
import edu.badpals.galleygrub.order.Comanda;

public class CheeseExtra extends Extra {

    private static double CHEESE_PRICE = 0.25;
    public CheeseExtra() {
    }

    @Override
    public void sumExtras(Comanda comanda) {
        int cheeseExtraQuantity = 0;
        for (Item item: comanda.itemList()){
            if (item.extra().equals("cheese")) {
                cheeseExtraQuantity += 1;
            }
        }
        comanda.updateTotal(comanda.getTotal() + CHEESE_PRICE * cheeseExtraQuantity);
        if(this.nextExtra.isPresent()) {
            this.nextExtra.get().sumExtras(comanda);
        }
    }
}

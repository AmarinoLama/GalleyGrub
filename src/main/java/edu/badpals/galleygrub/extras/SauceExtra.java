package edu.badpals.galleygrub.extras;

import edu.badpals.galleygrub.items.Item;
import edu.badpals.galleygrub.order.Comanda;

public class SauceExtra extends Extra {

    private static double SAUCE_PRICE = 0.5;
    public SauceExtra() {
    }

    @Override
    public void sumExtras(Comanda comanda) {
        int sauceExtraQuantity = 0;
        for (Item item: comanda.itemList()){
            if (item.extra().equals("sauce")) {
                sauceExtraQuantity += 1;
            }
        }
        comanda.updateTotal(comanda.getTotal() + SAUCE_PRICE * sauceExtraQuantity);
        if(this.nextExtra.isPresent()) {
            this.nextExtra.get().sumExtras(comanda);
        }
    }
}

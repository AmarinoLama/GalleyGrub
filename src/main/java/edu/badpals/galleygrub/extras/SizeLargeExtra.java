package edu.badpals.galleygrub.extras;

import edu.badpals.galleygrub.items.Item;
import edu.badpals.galleygrub.order.Comanda;

public class SizeLargeExtra extends Extra {

    private static double LARGE_PRICE = 0.5;
    public SizeLargeExtra() {
    }

    @Override
    public void sumExtras(Comanda comanda) {
        int largeExtraQuantity = 0;
        for (Item item: comanda.itemList()){
            if (item.extra().equals("large")) {
                largeExtraQuantity += 1;
            }
        }
        comanda.updateTotal(comanda.getTotal() + LARGE_PRICE * largeExtraQuantity);
        if(this.nextExtra.isPresent()) {
            this.nextExtra.get().sumExtras(comanda);
        }
    }
}

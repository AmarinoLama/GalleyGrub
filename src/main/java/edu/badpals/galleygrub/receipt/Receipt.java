package edu.badpals.galleygrub.receipt;

import edu.badpals.galleygrub.extras.Extra;
import edu.badpals.galleygrub.items.Item;
import edu.badpals.galleygrub.order.Comanda;

public class Receipt implements Ticket {

    private Double total;
    private Comanda order;

    public Receipt(Comanda comanda) {
        this.order = comanda;
    }

    @Override
    public Comanda getOrder() {
        return order;
    }

    @Override
    public void setChain(Extra extra) {

    }

    @Override
    public Double total() {
        double counter = 0d;
        for (Item item: order.itemList()) {
            counter += item.price();
        }
        this.total = counter;
        return counter;
    }

    @Override
    public void sumExtrasCharge() {

    }

    @Override
    public void print() {
        order.display();
        System.out.println("\tTOTAL --------> " + total() + "$");
    }
}

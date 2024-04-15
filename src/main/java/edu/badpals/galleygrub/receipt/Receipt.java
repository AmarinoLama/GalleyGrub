package edu.badpals.galleygrub.receipt;

import edu.badpals.galleygrub.extras.Extra;
import edu.badpals.galleygrub.items.Item;
import edu.badpals.galleygrub.order.Comanda;

public class Receipt implements Ticket {

    private Double total;
    private Comanda order;
    private Extra firstExtra;

    public Receipt(Comanda comanda) {
        this.order = comanda;
    }

    @Override
    public Comanda getOrder() {
        return order;
    }

    @Override
    public void setChain(Extra extra) {
        firstExtra = extra;
    }

    @Override
    public Extra getChain(){
        return this.firstExtra;
    }

    @Override
    public Double total() {
        double counter = 0d;
        for (Item item: order.itemList()) {
            counter += item.price();
        }
        this.order.updateTotal(counter);
        sumExtrasCharge();
        this.total = this.getOrder().getTotal();
        return this.total;
    }

    @Override
    public void sumExtrasCharge() {
        if(!(getChain()==null)) {
            this.getChain().sumExtras(this.getOrder());
        }
    }

    @Override
    public void print() {
        order.display();
        System.out.println("\tTOTAL --------> " + total() + "$");
    }
}

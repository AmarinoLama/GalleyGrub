package edu.badpals.galleygrub.extras;

import edu.badpals.galleygrub.order.Comanda;

import java.util.Optional;

public abstract class Extra {
    final static String CHEESE = "";
    final static String SAUCE = "";
    final static String SIZE_LARGE = "";

    String extraProduct;
    Optional<Extra> nextExtra = Optional.empty();

    public Extra() {
    }

    public void setNextExtra(Extra nextExtra) {
        this.nextExtra = Optional.ofNullable(nextExtra);
    }

    public abstract void sumExtras(Comanda comanda);
}

package edu.badpals.galleygrub.extras;

import edu.badpals.galleygrub.order.Comanda;

public class Regular extends Extra {
    public Regular() {
    }

    @Override
    public void sumExtras(Comanda comanda) {
        if(this.nextExtra.isPresent()){
            this.nextExtra.get().sumExtras(comanda);
        }
    }
}

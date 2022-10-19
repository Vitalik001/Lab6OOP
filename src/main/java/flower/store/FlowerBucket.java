package flower.store;

import java.util.ArrayList;

public class FlowerBucket {
    double price = 0.0;
    private ArrayList<FlowerPack> packs = new ArrayList();

    public FlowerBucket() {
    }

    void add(FlowerPack flpc) {
        this.packs.add(flpc);
        this.price += flpc.getPrice();
    }
    ArrayList<FlowerPack> getPacks(){
        return packs;
    }
    double getPrice() {
        return this.price;
    }
}
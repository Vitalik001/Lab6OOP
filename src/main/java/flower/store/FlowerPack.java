package flower.store;

public class FlowerPack {
    private Flower flower;
    private int quantity;

    FlowerPack(Flower fl, int quan) {
        this.flower = fl;
        this.quantity = quan;
    }
    Flower getFlower(){
        return flower;
    }
    double getPrice() {
        return this.flower.getPrice() * (double)this.quantity;
    }
}
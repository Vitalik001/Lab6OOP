package flower.store;

import java.util.ArrayList;

public class Store {
    private ArrayList<FlowerBucket> buckets = new ArrayList<FlowerBucket>();

    public void add(FlowerBucket bucket) {
        buckets.add(bucket);
    }

    public ArrayList<FlowerBucket> search(Flower flower) {
        ArrayList<FlowerBucket> result = new ArrayList<>();
        for (FlowerBucket bucket : buckets) {
            for (FlowerPack pack : bucket.getPacks()) {
                if (pack.getFlower().getFlowerType()
                        ==
                        flower.getFlowerType()) {
                    result.add(bucket);

                }

            }
        }
        return result;
    }
}

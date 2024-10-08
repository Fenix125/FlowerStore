package flowers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import lab.oop.flowers.Flower;
import lab.oop.flowers.FlowerBucket;
import lab.oop.flowers.FlowerColor;
import lab.oop.flowers.FlowerPack;
import lab.oop.flowers.FlowerType;
import lab.oop.flowers.Store;

import java.util.List;
import java.util.ArrayList;

public class FlowerStoreTest {
    private Store flowerStore;
    private static final int FLOWER_PRICE_1 = 80;
    private static final int FLOWER_SELLING_PRICE_1 = 50;
    private static final int FLOWER_PRICE_2 = 60;
    private static final int FLOWER_QUANTITY_1 = 5;
    private static final int FLOWER_QUANTITY_2 = 6;

    private Flower roseFlower = new Flower(FlowerColor.RED, FLOWER_PRICE_1, FLOWER_SELLING_PRICE_1, FlowerType.ROSE);
    private FlowerPack rosePack = new FlowerPack(roseFlower, FLOWER_QUANTITY_1);

    private Flower tulipFlower = new Flower(FlowerColor.YELLOW, FLOWER_PRICE_1, FLOWER_PRICE_2, FlowerType.TULIP);
    private FlowerPack tulipPack = new FlowerPack(tulipFlower, FLOWER_QUANTITY_1);

    @BeforeEach
    public void inti() {
        flowerStore = new Store();
    }
    @Test
    public void testStore() {
        FlowerBucket flowerBucket1 = new FlowerBucket();
        flowerBucket1.add(rosePack);
        flowerBucket1.add(tulipPack);

        FlowerBucket flowerBucket2 = new FlowerBucket();
        flowerBucket2.add(tulipPack);

        FlowerPack tulipPack2 = new FlowerPack(tulipFlower, FLOWER_QUANTITY_2);

        FlowerBucket flowerBucket3 = new FlowerBucket();
        flowerBucket3.add(tulipPack2);

        flowerStore.add(flowerBucket1);
        flowerStore.add(flowerBucket2);
        
        List<FlowerBucket> foundBuckets = flowerStore.search(flowerBucket2);
        FlowerBucket flowerSearched = foundBuckets.get(0);
        Assertions.assertEquals(flowerBucket2, flowerSearched);

        foundBuckets = flowerStore.search(flowerBucket3);
        List<FlowerBucket> empty = new ArrayList<>();
        Assertions.assertEquals(foundBuckets, empty);
    }                               
}

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
    private static final int FLOWER_PRICE_I = 80;
    private static final int FLOWER_SELLING_PRICE_I = 50;
    private static final int FLOWER_PRICE_II = 60;
    private static final int FLOWER_QUANTITY_I = 5;
    private static final int FLOWER_QUANTITY_II = 6;
    
    private Store flowerStore;
    private Flower roseFlower = 
    new Flower(FlowerColor.RED, FLOWER_PRICE_I, 
    FLOWER_SELLING_PRICE_I, FlowerType.ROSE);
    private FlowerPack rosePack = 
    new FlowerPack(roseFlower, FLOWER_QUANTITY_I);

    private Flower tulipFlower = 
    new Flower(FlowerColor.YELLOW, FLOWER_PRICE_I, 
    FLOWER_PRICE_II, FlowerType.TULIP);
    private FlowerPack tulipPack = 
    new FlowerPack(tulipFlower, FLOWER_QUANTITY_I);

    @BeforeEach
    public void inti() {
        flowerStore = new Store();
    }
    @Test
    public void testStore() {
        FlowerBucket flowerBucketN = new FlowerBucket();
        flowerBucketN.add(rosePack);
        flowerBucketN.add(tulipPack);

        FlowerBucket flowerBucketS = new FlowerBucket();
        flowerBucketS.add(tulipPack);

        FlowerPack tulipPackS = new FlowerPack(tulipFlower, FLOWER_QUANTITY_II);

        FlowerBucket flowerBucketM = new FlowerBucket();
        flowerBucketM.add(tulipPackS);

        flowerStore.add(flowerBucketN);
        flowerStore.add(flowerBucketS);
        
        List<FlowerBucket> foundBuckets = flowerStore.search(flowerBucketS);
        FlowerBucket flowerSearched = foundBuckets.get(0);
        Assertions.assertEquals(flowerBucketS, flowerSearched);

        foundBuckets = flowerStore.search(flowerBucketM);
        List<FlowerBucket> empty = new ArrayList<>();
        Assertions.assertEquals(foundBuckets, empty);
    }                               
}

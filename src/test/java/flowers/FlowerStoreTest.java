package flowers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lab.oop.flowers.Flower;
import lab.oop.flowers.FlowerBucket;
import lab.oop.flowers.FlowerColor;
import lab.oop.flowers.FlowerPack;
import lab.oop.flowers.FlowerType;
import lab.oop.flowers.Store;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.ArrayList;

public class FlowerStoreTest {
    private Store flowerStore;
    private Flower flower1 = new Flower(FlowerColor.RED, 80, 50, FlowerType.ROSE);
    private FlowerPack flowerPack1 = new FlowerPack(flower1, 5);

    private Flower flower2 = new Flower(FlowerColor.YELLOW, 80, 60, FlowerType.TULIP);
    private FlowerPack flowerPack2 = new FlowerPack(flower2, 5);

    @BeforeEach
    public void inti(){
        flowerStore = new Store();
    }
    @Test
    public void testStore(){

        FlowerBucket flowerBucket = new FlowerBucket();
        flowerBucket.add(flowerPack1);
        flowerBucket.add(flowerPack2);

        FlowerBucket flowerBucket2 = new FlowerBucket();
        flowerBucket2.add(flowerPack2);

        FlowerPack flowerPack3 = new FlowerPack(flower2, 6);

        FlowerBucket flowerBucket3 = new FlowerBucket();
        flowerBucket3.add(flowerPack3);
        flowerStore.add(flowerBucket);
        flowerStore.add(flowerBucket2);
        
        List<FlowerBucket> foundBuckets = flowerStore.search(flowerBucket2);
        FlowerBucket flowerSearched = foundBuckets.get(0);
        assertEquals(flowerBucket2, flowerSearched);
        foundBuckets = flowerStore.search(flowerBucket3);
        List<FlowerBucket> empty = new ArrayList<>();
        assertEquals(foundBuckets, empty);
    }                               
}

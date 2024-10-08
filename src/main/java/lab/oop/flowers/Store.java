package lab.oop.flowers;
import java.util.List;
import java.util.ArrayList;

public class Store {
    private List<FlowerBucket> allBuckets;
    
    public Store() {
        allBuckets = new ArrayList<>();
    }
    public void add(FlowerBucket flowerBucket) {
        allBuckets.add(flowerBucket);
    }
    public List<FlowerBucket> search(FlowerBucket flowerBucket) {
        List<FlowerBucket> foundBuckets = new ArrayList<>();
        for (int i = 0; i < allBuckets.size(); i++) {
            if (allBuckets.get(i).equals(flowerBucket)) {
                foundBuckets.add(allBuckets.get(i));
            }
        }
        return foundBuckets;
    }
}

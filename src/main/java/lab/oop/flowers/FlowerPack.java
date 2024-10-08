package lab.oop.flowers;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class FlowerPack {
    private Flower flower;
    private int count;

    public FlowerPack(Flower flower, int count) {
        this.flower = new Flower(flower);
        this.count = count;
    }
    public double getPrice() {
        return flower.getPrice() * count;
    }
}

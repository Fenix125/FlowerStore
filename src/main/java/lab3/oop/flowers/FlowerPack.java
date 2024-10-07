package lab3.oop.flowers;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FlowerPack {
    private Flower flower;
    private int count;

    public double getPrice(){
        return flower.getPrice() * count;
    }
    public FlowerPack(Flower flower, int count){
        this.flower = new Flower(flower);
        this.count = count;
    }
}

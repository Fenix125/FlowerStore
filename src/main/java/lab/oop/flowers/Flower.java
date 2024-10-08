package lab.oop.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @AllArgsConstructor
public class Flower {
    private FlowerColor color;
    private int sepallength;
    private double price;
    private FlowerType flowerType;
    public Flower() { }
    public Flower(Flower flower) {
        color = flower.color;
        sepallength = flower.sepallength;
        price = flower.price;
        flowerType = flower.flowerType;
    }
    public String getColor() {
        return color.toString();
    }
}

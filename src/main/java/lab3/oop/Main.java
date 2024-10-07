package lab3.oop;

import lab3.oop.flowers.Flower;
import lab3.oop.flowers.FlowerColor;
import lab3.oop.flowers.FlowerPack;
import lab3.oop.flowers.FlowerType;

public class Main {
    public static void main(String[] args) {
        Flower flower = new Flower(FlowerColor.RED, 80, 100, FlowerType.ROSE);
        FlowerPack flowerPack = new FlowerPack(flower, 5);
        System.out.println(flowerPack.getPrice());
        flower.setPrice(10);
        System.out.println(flowerPack.getPrice());

    }
}

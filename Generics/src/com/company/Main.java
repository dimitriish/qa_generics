package com.company;

import java.util.Arrays;

public class Main {

    public static void main(final String[] args) {

        int[] arr = new int[4];

        Arrays.stream(arr).min();

        Apple apple = new Apple();
        apple.setFresh(false);
        Fruit fruit = new Fruit();
        Box<Fruit> fruitBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Box<Box<Apple>>> box0 = new Box<>();
        Box<Box<Apple>> box1 = new Box<>();
        Box<Apple> box2 = new Box<>();
        box2.put(apple);
        box1.put(box2);
        box0.put(box1);
        fruitBox.put(fruit);
        appleBox.put(apple);
        BoxUtil.copyFromBoxToBox(appleBox, fruitBox);
        BoxUtil.copyFreshFruitFromBoxToBox(appleBox, fruitBox);
        BoxUtil.printElementFromTwoBoxes(box0);
        BoxUtil.printElementFromBoxes(box0);
        BoxUtil.printElementFromBoxes(box2);

    }
}

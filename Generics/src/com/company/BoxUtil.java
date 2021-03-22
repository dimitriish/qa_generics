package com.company;

public class BoxUtil {


    public static <T> void copyFromBoxToBox(final Box<T> src, final Box<? super T> dest) {
        if (src.get() != null) {
            dest.put(src.get());
        } else {
            System.out.println("Коробка пуста!");
        }
    }


    public static <T extends Fruit> void copyFreshFruitFromBoxToBox(final Box<T> src, final Box<? super T> dest) {
        if (src.get() != null) {
            if (src.get().isFresh()) {
                dest.put(src.get());
            } else {
                System.out.println("Содержимое src не свежо");
            }
        } else {
            System.out.println("Коробка пуста!");
        }
    }


    public static <T> void printElementFromTwoBoxes(final Box<Box<T>> box) {
        if (box.get() != null && box.get().get() != null) {
            System.out.println(box.get().get().toString());
        } else {
            System.out.println("В одной из коробок пусто");
        }
    }

    //предлагается сделать box final, но его нужно менять
    public static <T> void printElementFromBoxes(Box<T> box) {
        while (box.get() instanceof Box) {
            box = (Box<T>) box.get(); //unchecked cast, но в цикле проходит проверка
        }
        if (box.get() != null) {
            System.out.println(box.get().toString());
        } else {
            System.out.println("Последняя коробка пуста");
        }
    }
}

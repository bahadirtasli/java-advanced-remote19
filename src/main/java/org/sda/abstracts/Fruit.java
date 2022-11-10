package org.sda.abstracts;

/**
 * Fruit class matching the abstract class
 *
 * @author bahadir tasli
 */

public class Fruit extends Food{

    public Fruit(String color) {
        super(color);
    }

    @Override
    public void eat() {
        System.out.println("I'm eating a " + super.getColor() + "fruit..");

    }
}
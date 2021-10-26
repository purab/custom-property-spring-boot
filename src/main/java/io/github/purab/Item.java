package io.github.purab;

public class Item {
    private String name;
    private int qty;

    public Item(String name, int qty) {
        this.name = name;
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", qty=" + qty +
                '}';
    }
}

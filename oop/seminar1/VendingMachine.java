package oop.seminar1;

public interface VendingMachine {
    Product getProduct(String name);

    Product getProduct(String name, double volume);
}

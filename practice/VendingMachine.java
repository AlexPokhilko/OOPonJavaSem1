package practice;

public interface VendingMachine {
    Product getProduct(String name) throws IllegalStateException;
}

package com.iheart.training;

public interface ShoppingItem {
    public double accept(ShoppingCartVisitor visitor);
}

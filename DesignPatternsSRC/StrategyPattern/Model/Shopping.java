package StrategyPattern.Model;

import StrategyPattern.Model.Currency;
import StrategyPattern.Model.Product;

import java.util.List;

public interface Shopping {

    double calculatePrice(List<Product> products);
    Currency getCurrency();
}
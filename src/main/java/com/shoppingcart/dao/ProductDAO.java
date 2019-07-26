package com.shoppingcart.dao;

import com.shoppingcart.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 *  A <code>ProductDAO</code> is a fake Database call with some products for examples purposes.
 */
public class ProductDAO {

  public static List<Product> getProducts() {
    //FAKE DATABASE
	List<Product> list = new ArrayList<Product>();
	Product product = new Product(0, "HDD", 1500);
	Product product1 = new Product(1, "RAM 8GB", 2000);
	Product product2 = new Product(2, "ATX PS 650w", 3800);
	Product product3 = new Product(3, "SSD 120 GB Kingston", 1300);
	Product product4 = new Product(4, "SSD 500 GB Kingston", 3500);
	Product product5 = new Product(5, "Thermaltake Case", 2000);
	Product product6 = new Product(6, "Mechanic Keyboard HyperX", 4000);
	list.add(product);
	list.add(product1);
	list.add(product2);
	list.add(product3);
	list.add(product4);
	list.add(product5);
	list.add(product6);
	return list;
  }
}

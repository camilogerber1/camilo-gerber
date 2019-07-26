package com.shoppingcart.services;

import com.shoppingcart.model.Product;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ShoppingCartTest {

  @org.junit.Test public void addToCart() {
	ShoppingCart myCart = new ShoppingCart();
	List<Product> cart = new ArrayList<Product>();
	myCart.showAvailableProducts();
	cart.add(myCart.addToCart(0));
	cart.add(myCart.addToCart(3));
	cart.add(myCart.addToCart(4));
	myCart.showCartDetails(cart);
	assertEquals(cart.get(0), myCart.getList().get(0));
  }

  @Test public void removeItemFromCart() {
	ShoppingCart myCart = new ShoppingCart();
	List<Product> cart = new ArrayList<Product>();
	boolean flag = false;
	myCart.showAvailableProducts();
	cart.add(myCart.addToCart(0));
	cart.add(myCart.addToCart(3));
	cart.add(myCart.addToCart(4));
	myCart.showCartDetails(cart);
	myCart.removeItemFromCart(5, cart);
	myCart.removeItemFromCart(3, cart);
	myCart.showCartDetails(cart);
	for (Product iter : cart) {
	  if (iter.getId() == 3)
		flag = true;
	}
	assertFalse(flag);
  }

  @Test public void purchaseProductsInCart() {
	ShoppingCart myCart = new ShoppingCart();
	List<Product> cart = new ArrayList<Product>();
	myCart.showAvailableProducts();
	cart.add(myCart.addToCart(0));
	cart.add(myCart.addToCart(3));
	cart.add(myCart.addToCart(4));
	myCart.showCartDetails(cart);
	myCart.purchaseProductsInCart(cart);
	myCart.showAvailableProducts();
	assertFalse(myCart.getList().contains(cart.get(0)));
  }


}
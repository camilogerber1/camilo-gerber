package com.shoppingcart.services;

import com.shoppingcart.dao.ProductDAO;
import com.shoppingcart.model.Product;
import java.util.List;

/**
 * A <code>ShoppingCart</code> contains the functionality of provide the necessary information for manage a shopping cart.
 *
 * @author camilogerber
 * @version 1.0.0 July 26, 2019
 */
public class ShoppingCart { //UserService

  private List<Product> list = ProductDAO.getProducts();

  /**
   * Print all products.
   *
	 * Show all the available products for the user can put them into a shopping cart.
   *
   */
  public void showAvailableProducts() {
	System.out.println("\nAvailable products: ");
	for (Product prod : list) {
	  System.out.println(prod.toString());
	}
  }

  /**
   *
   * Get the list object of products.
   *
   * @return the list object of products.
   */
  public List<Product> getList() {
	return list;
  }

  /**
   * Show details of the current Shopping Cart
   *
   * Prints all the products in the Shopping Cart with details and the total amount.
   * Check if the Shopping Cart is empty.
   *
   * @param products is the current shopping cart.
   */
  public void showCartDetails(List<Product> products) {
	System.out.println("\nCart details");
	if (products.isEmpty()) {
	  System.out.println("<-------OH!! The cart empty. ¿What are you wating for?------->");
	} else {
	  int total = 0;
	  for (Product iter : products) {
		System.out.println(iter.toString());
		total += iter.getPrice();
	  }
	  System.out.println("TOTAL: $" + total);
	}
  }

  /**
   *
   * Add to cart an available product.
   *
   *
   * @param id Is necessary to identify what item is need to be added.
   * @return An Product class object to be added to the shopping cart.
   */
  //GET
  public Product addToCart(int id) {
	Product prod = new Product();
	if (list.contains(list.get(id))) {
	  prod = list.get(id);
	}
	return prod;
  }

  /**
   * Remove an item from the user Shopping Cart
   *
   *
   * @param id It's used to identify what item is going to be removed from the Shopping Cart.
   * @param products Is the current shopping Cart
   * @return Returns an object of List of Products objects without the item removed.
   */
  public List<Product> removeItemFromCart(int id, List<Product> products) {
	boolean flag = false;
	if (!products.isEmpty()) {
	  for (Product pro : products) {
		if (pro.getId() == id) {
		  products.remove(pro);
		  flag = true;
		  break;
		}
	  }
	  if (flag) {
		System.out.println("\nItem 'ID: '" + id + " was removed successfully from shopping cart.");
	  } else {
		System.out.println("\nItem with ID: " + id + " not found in shopping cart.");
	  }

	} else {
	  System.out.println("NOTE: The cart is empty");
	}
	return products;
  }

  /**
   *
   * Confirm purchase
   *
   * Check if the current Shopping Cart is empty before proceed.
   *
   * Deletes from the main list of products the items contained in the Shopping Cart.
   *
   * @param products is the list object who contains all the products in the Shopping Cart
   */
  public void purchaseProductsInCart(List<Product> products) {
	if (!products.isEmpty()) {
	  for (Product products1 : products) {
		list.remove(products1);
	  }
	  System.out.println("\nPURCHASE STATUS: <---Thanks for your purchase!!--->");
	} else {
	  System.out.println("Nothing to purchase, please add some products to the cart");
	}
  }
}


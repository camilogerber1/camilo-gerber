package com.shoppingcart.model;

/**
 *
 * A <code>Product</code> contains the basic structure of an Product object.
 */
public class Product {

  private int id;
  private String article;
  private float price;

  public Product() {
  }

  public Product(int id, String article, float price) {
	this.id = id;
	this.article = article;
	this.price = price;
  }

  public int getId() {
	return id;
  }

  public float getPrice() {
	return price;
  }

  @Override public String toString() {
	return "Product{" + "id=" + id + ", article='" + article + '\'' + ", price=" + price + '}';
  }
}

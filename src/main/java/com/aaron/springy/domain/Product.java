package com.aaron.springy.domain;

/**
 *
 * @author aaronstevenson
 */
// Just a POJO domain object.  We'll expand on this later when we add a persistence layer.
public class Product {

  private String sku;

  public Product(String sku) {
    this.sku = sku;
  }

  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

}

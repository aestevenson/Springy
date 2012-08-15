package com.aaron.springy.domain;

/**
 *
 * @author aaronstevenson
 */
// Just a POJO domain object.  We'll expand on this later when we add a persistence layer.
public class IceCream {

  private String flavor;

  public IceCream(String flavor) {
    this.flavor = flavor;
  }

  public String getFlavor() {
    return flavor;
  }

  public void setFlavor(String flavor) {
    this.flavor = flavor;
  }

}

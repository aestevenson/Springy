package com.aaron.springy.services;

import com.aaron.springy.domain.Product;
import org.springframework.stereotype.Service;

//Tells Spring that this is a Service class.  Among other things, this can now
//be wired to controllers.
@Service
public class InventoryService {

  //A pretty basic service method
  public Product findSku(String sku) {
    return new Product(sku);
  }

}

package com.aaron.springy.controllers;

import com.aaron.springy.domain.Product;
import com.aaron.springy.services.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//Lets Spring know that this is a Controller component.  Likely, the biggest
//thing this accomplishes is that Spring knows to generate the URL routes from
//all the Controllers.
@Controller

//This narrows all method RequestMappings to "/product/x" where x is the mapping defined at
//the method level.
@RequestMapping("/product")
class ProductController {

//  Tells Spring that it needs to wire this object. A @Component of type TownService
//  must exist.  There is as TownService is a '@Service', which is a subclass of '@Component'
  @Autowired
  private InventoryService inventoryService;

  //Used at startup by Spring to define application routes.  In this case a GET request at
  //'/springy/product/1223' would get routed here with 1223 passed into the method as
  // the sku parameter.
  @RequestMapping(method = RequestMethod.GET, value = "/{sku}")

  //Tells Spring to pass the method return value as the ResponseBody.  It will serialize
  //the object as JSON if Jackson is in the Classpath and '@EnableWebMvc' exists.
  @ResponseBody
  public Product getProduct(@PathVariable final String sku) {
    return this.inventoryService.findSku(sku);
  }

  // For Spring to wire the service into this component, it must have a public
  // setter for that service
  public void setTownService(InventoryService inventoryService) {
    this.inventoryService = inventoryService;
  }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aaron.springy.controllers;

import com.aaron.springy.domain.IceCream;
import com.aaron.springy.services.TownService;
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

//This narrows all method RequestMappings to "/dionis/x" where x is the mapping defined at
//the method level.
@RequestMapping("/dionis")
class DionisController {

//  Tells Spring that it needs to wire this object. A @Component of type TownService
//  must exist.  There is as TownService is a '@Service', which is a subclass of '@Component'
  @Autowired
  private TownService townService;

  //Used at startup by Spring to define application routes.  In this case a GET request at
  //'/springy/dionis/icecream/vanilla' would get routed here with vanilla passed into the method as
  // the flavor parameter.
  @RequestMapping(method = RequestMethod.GET, value = "/icecream/{flavor}")

  //Tells Spring to pass the method return value as the ResponseBody.  It will serialize
  //the object as JSON if Jackson is in the Classpath and '@EnableWebMvc' exists.
  @ResponseBody
  public IceCream getIceCream(@PathVariable final String flavor) {
    return this.townService.getIcecream(flavor);
  }

  // For Spring to wire the service into this component, it must have a public
  // setter for that service
  public void setTownService(TownService townService) {
    this.townService = townService;
  }
}

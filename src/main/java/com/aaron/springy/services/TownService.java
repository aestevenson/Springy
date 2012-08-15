package com.aaron.springy.services;

import com.aaron.springy.domain.IceCream;
import org.springframework.stereotype.Service;

//Tells Spring that this is a Service class.  Among other things, this can now
//be wired to controllers.
@Service
public class TownService {

  //A pretty basic service method
  public IceCream getIcecream(String flavor) {
    return new IceCream(flavor);
  }

}

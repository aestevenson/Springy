/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aaron.springy.config;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Marks it has a Configuration object, so Spring can bootstrap it at startup.
@Configuration

//Here we could import in a legacy xml based configuration file
//@ImportResource( { "classpath*:/appconfig.xml" } )

//Tells Spring where to look for '@Service's and '@Controller's
@ComponentScan( basePackages = "com.aaron.springy" )
public class AppConfig {

//Empty properties object
  @Bean
   public static PropertyPlaceholderConfigurer properties() {
      PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
      return ppc;
   }

}

package com.hendisantika.kotlin.configuration

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter
/*

  @author hendisantika
  Created on Jan 19, 2017
*/

@Configuration
open class WebConfiguration : WebMvcConfigurerAdapter() {

    override fun addViewControllers(viewControllerRegistry: ViewControllerRegistry) {
        viewControllerRegistry.addViewController("/").setViewName("index")
    }

}
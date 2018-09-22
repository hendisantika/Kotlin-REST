package com.hendisantika.kotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.hateoas.config.EnableHypermediaSupport
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession

/*

  @author hendisantika
  Created on Jan 19, 2017
*/
@SpringBootApplication
@EnableRedisHttpSession
@EnableHypermediaSupport(type = arrayOf(EnableHypermediaSupport.HypermediaType.HAL))
open class AplikasiHelpDesk 
fun main(args: Array<String>) {
    SpringApplication.run(AplikasiHelpDesk::class.java, *args)
}
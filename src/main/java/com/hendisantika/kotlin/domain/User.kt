package com.hendisantika.kotlin.domain

import java.io.Serializable
import java.util.*
import javax.persistence.*

/*

  @author hendisantika
  Created on Jan 19, 2017
*/

@Entity
@Table(name = "tb_user")
class User : Serializable {

    @Id
    @Column(name = "email", length = 30)
    var email: String? = null

    @Column(name = "password", length = 150)
    var password: String? = null

    @Column(name = "enable")
    var enable: Boolean = java.lang.Boolean.TRUE

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = arrayOf(CascadeType.ALL))
    var userRoles: Set<UserRole> = HashSet()

}
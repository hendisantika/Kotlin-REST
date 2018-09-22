package com.hendisantika.kotlin.repository

import com.hendisantika.kotlin.domain.User
import com.hendisantika.kotlin.domain.UserRole
import org.springframework.data.rest.core.annotation.HandleBeforeCreate
import org.springframework.data.rest.core.annotation.RepositoryEventHandler
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Component
import java.util.*
/*

  @author hendisantika
  Created on Jan 19, 2017
*/

@Component
@RepositoryEventHandler(User::class)
class UserRepositoryEventHandler {

    @HandleBeforeCreate
    fun handleUserBeforeCreate(user: User) {
        val bCryptPasswordEncoder = BCryptPasswordEncoder()
        user.password = bCryptPasswordEncoder.encode(user.password)

        val userRole = UserRole()
        userRole.user = user

        val userRoles: Set<UserRole> = HashSet()
        userRoles.plus(userRole)
        user.userRoles = userRoles
    }

}
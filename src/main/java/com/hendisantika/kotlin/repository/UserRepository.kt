package com.hendisantika.kotlin.repository

import com.hendisantika.kotlin.domain.User
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.security.access.prepost.PreAuthorize

/*

  @author hendisantika
  Created on Jan 19, 2017
*/

@PreAuthorize("hasRole('ROLE_USER')")
@RepositoryRestResource(collectionResourceRel = "user", path = "user")
interface UserRepository : PagingAndSortingRepository<User, String> {

    @PreAuthorize("permitAll")
    @Query("select u from User u left join fetch u.userRoles ur where u.email = :email")
    fun authenticateUser(@Param("email") email: String): User

    @PreAuthorize("permitAll")
    override fun <S : User?> save(p0: S): S

}
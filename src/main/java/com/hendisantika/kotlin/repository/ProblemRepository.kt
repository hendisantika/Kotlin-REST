package com.hendisantika.kotlin

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.security.access.prepost.PreAuthorize

/*

  @author hendisantika
  Created on Jan 19, 2017
*/

@PreAuthorize("hasRole('ROLE_USER')")
@RepositoryRestResource(collectionResourceRel = "problem", path = "problem")
interface ProblemRepository : PagingAndSortingRepository<Problem, String> {
}